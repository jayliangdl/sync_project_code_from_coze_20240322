package com.xxxx.commerce.market.controller;

import com.xxxx.commerce.market.service.UserService;
import com.xxxx.commerce.market.vo.DeleteUserRequest;
import com.xxxx.commerce.market.vo.UpdateUserPasswordRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/delete")
    public boolean deleteUser(@RequestBody DeleteUserRequest deleteUserRequest){
        return userService.deleteUser(deleteUserRequest.getUserId());
    }

    @PostMapping("/updatePassword")
    public boolean updateUserPassword(@RequestBody UpdateUserPasswordRequest updateUserPasswordRequest){
        return userService.updateUserPassword(updateUserPasswordRequest.getUserId(), updateUserPasswordRequest.getNewPassword());
    }
}

