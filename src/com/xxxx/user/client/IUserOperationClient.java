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

@RequestMapping("/user")
public interface IUserOperationClient {
   
    @PostMapping("/addUser")
    AddUserResponse addUser(@RequestBody AddUserRequest request);
    
    @PostMapping("/deleteUser")
    DeleteUserResponse deleteUser(@RequestBody DeleteUserRequest request);
    
    @PostMapping("/updateUserPassword")
    UpdateUserPasswordResponse updateUserPassword(@RequestBody UpdateUserPasswordRequest request);
}