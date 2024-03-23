package com.xxxx.user.client;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.UpdateUserPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.UpdateUserPasswordResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户操作接口定义
 */
@RequestMapping("/user")
public interface IUserOperationClient {

    /**
     * 新增一个用户
     * @param request 新增用户请求对象
     * @return 操作结果
     */
    @PostMapping("/addUser")
    AddUserResponse addUser(@RequestBody AddUserRequest request);

    /**
     * 删除一个用户
     * @param request 删除用户请求对象
     * @return 操作结果
     */
    @PostMapping("/deleteUser")
    DeleteUserResponse deleteUser(@RequestBody DeleteUserRequest request);

    /**
     * 修改用户密码
     * @param request 修改用户密码请求对象
     * @return 操作结果
     */
    @PostMapping("/updateUserPassword")
    UpdateUserPasswordResponse updateUserPassword(@RequestBody UpdateUserPasswordRequest request);
}