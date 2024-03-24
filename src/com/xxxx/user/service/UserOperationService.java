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
        // 调用Dao层的查询方法，检查是否有重复用户
        UserDO existingUser = userDao.queryUser(null, request.getUsername());
        // 如果有重复用户，抛出业务异常
        if (existingUser != null) {
            throw new RuntimeException("用户重复添加");
        }
        // 如果没有重复用户，调用Dao层的新增方法，添加新用户
        UserDO newUser = new UserDO();
        newUser.setUserName(request.getUsername());
        newUser.setGender(request.getGender());
        newUser.setPsw(DigestUtils.md5Hex(request.getPassword()));
        userDao.createUser(newUser);
        return new AddUserResponse(true);
    }

    /**
    * 更新用户密码方法
    * @param request UpdateUserPasswordRequest
    * @return UpdateUserPasswordResponse
    */
    @Override
    public UpdateUserPasswordResponse updateUserPassword(UpdateUserPasswordRequest request) {
        // 调用Dao层的查询方法，检查用户是否存在且有效
        UserDO existingUser = userDao.queryUser(request.getUserId(), null);
        // 如果用户不存在或无效，抛出业务异常
        if (existingUser == null || !existingUser.getValid()) {
            throw new RuntimeException("用户不存在");
        }
        // 如果用户存在，加密入参密码，调用Dao层的修改方法，更新用户密码
        existingUser.setPassword(DigestUtils.md5Hex(request.getPassword()));
        userDao.updateUser(existingUser);
        return new UpdateUserPasswordResponse(true);
    }

    /**
    * 删除用户方法
    * @param request DeleteUserRequest
    * @return DeleteUserResponse
    */
    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        // 调用Dao层的查询方法，检查用户是否存在且有效
        UserDO existingUser = userDao.queryUser(request.getUserId(), null);
        // 如果用户不存在或无效，抛出业务异常
        if (existingUser == null || !existingUser.getValid()) {
            throw new RuntimeException("用户不存在");
        }
        // 如果用户存在，调用Dao层的删除方法，处理用户状态
        userDao.deleteUser(request.getUserId());
        return new DeleteUserResponse(true);
    }
}
