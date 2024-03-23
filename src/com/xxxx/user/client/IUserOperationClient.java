package com.xxxx.user.client;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.ModifyUserPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.ModifyUserPasswordResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "userOperationClient", path = "/user/")
public interface IUserOperationClient {

    @PostMapping(value = "/addUser")
    AddUserResponse addUser(@RequestBody AddUserRequest request);

    @PostMapping(value = "/deleteUser")
    DeleteUserResponse deleteUser(@RequestBody DeleteUserRequest request);

    @PostMapping(value = "/modifyUserPassword")
    ModifyUserPasswordResponse modifyUserPassword(@RequestBody ModifyUserPasswordRequest request);
}