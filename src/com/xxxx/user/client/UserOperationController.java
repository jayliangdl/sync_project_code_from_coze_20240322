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
 * 用户操作接口实现
 */
@RestController
public class UserOperationController implements IUserOperationClient {

    @Autowired
    private IUserOperationService userOperationService;

    /**
     * 新增一个用户
     * @param request 新增用户请求对象
     * @return 操作结果
     */
    @Override
    public AddUserResponse addUser(AddUserRequest request) {
        return userOperationService.addUser(request);
    }

    /**
     * 删除一个用户
     * @param request 删除用户请求对象
     * @return 操作结果
     */
    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return userOperationService.deleteUser(request);
    }

    /**
     * 修改用户密码
     * @param request 修改用户密码请求对象
     * @return 操作结果
     */
    @Override
    public UpdateUserPasswordResponse updateUserPassword(UpdateUserPasswordRequest request) {
        return userOperationService.updateUserPassword(request);
    }
}