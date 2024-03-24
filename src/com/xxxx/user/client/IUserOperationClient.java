package com.xxxx.user.client;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.UpdateUserPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.UpdateUserPasswordResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUserOperationClient {

    @PostMapping("/user/add")
    AddUserResponse addUser(@RequestBody AddUserRequest request);

    @PostMapping("/user/delete")
    DeleteUserResponse deleteUser(@RequestBody DeleteUserRequest request);

    @PostMapping("/user/updatePassword")
    UpdateUserPasswordResponse updateUserPassword(@RequestBody UpdateUserPasswordRequest request);

}