package com.xxxx.user.service;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.UpdateUserPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.UpdateUserPasswordResponse;

/**
 * 用户操作服务层接口定义
 */
public interface IUserOperationService {

    /**
     * 新增一个用户
     * @param request 新增用户请求对象
     * @return 操作结果
     */
    AddUserResponse addUser(AddUserRequest request);

    /**
     * 删除一个用户
     * @param request 删除用户请求对象
     * @return 操作结果
     */
    DeleteUserResponse deleteUser(DeleteUserRequest request);

    /**
     * 修改用户密码
     * @param request 修改用户密码请求对象
     * @return 操作结果
     */
    UpdateUserPasswordResponse updateUserPassword(UpdateUserPasswordRequest request);
}