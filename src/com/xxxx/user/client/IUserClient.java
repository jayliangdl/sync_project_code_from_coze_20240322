package com.xxxx.user.client;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.AlterPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.AlterPasswordResponse;
import org.springframework.web.bind.annotation.*;

public interface IUserClient {

    @PostMapping("/user/add")
    AddUserResponse addUser(@RequestBody AddUserRequest request);
    
    @PostMapping("/user/delete")
    DeleteUserResponse deleteUser(@RequestBody DeleteUserRequest request);

    @PostMapping("/user/alterPassword")
    AlterPasswordResponse alterPassword(@RequestBody AlterPasswordRequest request);
}  