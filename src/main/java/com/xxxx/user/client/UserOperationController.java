package com.xxxx.user.client;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.UpdateUserPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.UpdateUserPasswordResponse;
import com.xxxx.user.service.IUserOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户操作Controller，实现了用户新增、删除和密码修改功能
 */
@RestController
public class UserOperationController implements IUserOperationClient {
   
    @Autowired
    private IUserOperationService userOperationService;

    /**
     * 新增用户
     * @param request 包含用户名、密码和性别的请求
     * @return 操作结果(true-成功；false-失败)
     */
    @Override
    public AddUserResponse addUser(AddUserRequest request) {
        return userOperationService.addUser(request);
    }
    
    /**
     * 删除用户
     * @param request 包含要删除的用户ID的请求
     * @return 操作结果(true-成功；false-失败)
     */
    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return userOperationService.deleteUser(request);
    }

    /**
     * 修改用户密码
     * @param request 包含用户ID和新密码的请求
     * @return 操作结果(true-成功；false-失败)
     */
    @Override
    public UpdateUserPasswordResponse updateUserPassword(UpdateUserPasswordRequest request) {
        return userOperationService.updateUserPassword(request);
    }
}