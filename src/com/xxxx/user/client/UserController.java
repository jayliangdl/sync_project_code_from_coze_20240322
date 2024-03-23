package com.xxxx.user.client;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.AlterPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.AlterPasswordResponse;
import com.xxxx.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController implements IUserClient {

    @Autowired 
    private IUserService userService;

    @PostMapping("/user/add")
    public AddUserResponse addUser(@RequestBody AddUserRequest request) {
        return userService.addUser(request);
    }

    @PostMapping("/user/delete")
    public DeleteUserResponse deleteUser(@RequestBody DeleteUserRequest request) {
        return userService.deleteUser(request);
    }

    @PostMapping("/user/alterPassword")
    public AlterPasswordResponse alterPassword(@RequestBody AlterPasswordRequest request) {
        return userService.alterPassword(request);
    }
}  