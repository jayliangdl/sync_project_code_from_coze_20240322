package com.xxxx.user.service;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.response.UpdateUserPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.UpdateUserPasswordResponse;

/**
 * 用户操作Service接口，定义了用户新增、删除和密码修改功能
 */
public interface IUserOperationService {
   
    /**
     * 新增用户
     * @param request 包含用户名、密码和性别的请求
     * @return 操作结果(true-成功；false-失败)
     */
    AddUserResponse addUser(AddUserRequest request);
    
    /**
     * 删除用户
     * @param request 包含要删除的用户ID的请求
     * @return 操作结果(true-成功；false-失败)
     */
    DeleteUserResponse deleteUser(DeleteUserRequest request);
    
    /**
     * 修改用户密码
     * @param request 包含用户ID和新密码的请求
     * @return 操作结果(true-成功；false-失败)
     */
    UpdateUserPasswordResponse updateUserPassword(UpdateUserPasswordRequest request);
}