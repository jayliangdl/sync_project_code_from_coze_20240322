package com.xxxx.user.service;

import com.xxxx.user.dao.UserDao;
import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.UpdateUserPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.UpdateUserPasswordResponse;
import com.xxxx.user.model.UserDO;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* UserOperationService，业务处理层
*/
@Service
public class UserOperationService implements IUserOperationService {

    @Autowired
    private UserDao userDao;
   
    /**
    * 添加新用户方法
    * @param request AddUserRequest
    * @return AddUserResponse
    */
    @Override
    public AddUserResponse addUser(AddUserRequest request) {
        // 调用Dao层，检查是否有重复用户
        UserDO existingUser = userDao.queryUser(null, request.getUsername());
        if (existingUser != null) {
            // 如果有重复用户，抛出业务异常
            throw new RuntimeException("用户重复添加");
        }
        // 如果没有重复用户，调用Dao层，添加新用户
        UserDO newUser = new UserDO();
        newUser.setUserName(request.getUsername());
        newUser.setGender(request.getGender());
        newUser.setPsw(DigestUtils.md5Hex(request.getPassword()));
        userDao.createUser(newUser);
        return new AddUserResponse(true);
    }

    /**
    * 删除用户方法
    * @param request DeleteUserRequest 
    * @return DeleteUserResponse
    */
    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        // 调用Dao层，检查用户是否存在和有效
        UserDO existingUser = userDao.queryUser(Integer.valueOf(request.getUserId()), null);
        if (existingUser == null || !existingUser.getStatus().equals("1")) {
            // 如果用户不存在或无效，抛出业务异常
            throw new RuntimeException("用户不存在");
        }
        // 如果用户存在，调用Dao层，删除用户
        userDao.deleteUser(Integer.valueOf(request.getUserId()));
        return new DeleteUserResponse(true);
    }

    /**
    * 更新用户密码方法
    * @param request UpdateUserPasswordRequest
    * @return UpdateUserPasswordResponse
    */
    @Override
    public UpdateUserPasswordResponse updateUserPassword(UpdateUserPasswordRequest request) {
        // 调用Dao层，检查用户是否存在和有效
        UserDO existingUser = userDao.queryUser(Integer.valueOf(request.getUserId()), null);
        if (existingUser == null || !existingUser.getStatus().equals("1")) {
            // 如果用户不存在或无效，抛出业务异常
            throw new RuntimeException("用户不存在");
        }
        // 如果用户存在，加密新密码，调用Dao层，更新用户密码
        UserDO updateUser = new UserDO();
        updateUser.setId(existingUser.getId());
        updateUser.setPsw(DigestUtils.md5Hex(request.getNewPassword()));
        userDao.updateUser(updateUser);
        return new UpdateUserPasswordResponse(true);
    }
}