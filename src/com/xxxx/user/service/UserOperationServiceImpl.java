package com.xxxx.user.service;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.UpdateUserPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.UpdateUserPasswordResponse;
import org.springframework.stereotype.Service;

/**
 * 用户操作服务层接口实现
 */
@Service
public class UserOperationServiceImpl implements IUserOperationService{

    /**
     * 新增一个用户
     * @param request 新增用户请求对象
     * @return 操作结果
     */
    @Override
    public AddUserResponse addUser(AddUserRequest request){
        // TODO: 在这里添加你的代码实现
        return null;
    }

    /**
     * 删除一个用户
     * @param request 删除用户请求对象
     * @return 操作结果
     */
    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request){
        // TODO: 在这里添加你的代码实现
        return null;
    }

    /**
     * 修改用户密码
     * @param request 修改用户密码请求对象
     * @return 操作结果
     */
    @Override
    public UpdateUserPasswordResponse updateUserPassword(UpdateUserPasswordRequest request){
        // TODO: 在这里添加你的代码实现
        return null;
    }
}