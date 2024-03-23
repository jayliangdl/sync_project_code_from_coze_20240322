package com.xxxx.user.service;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.AlterPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.AlterPasswordResponse;

public interface IUserService {
    AddUserResponse addUser(AddUserRequest request);
    DeleteUserResponse deleteUser(DeleteUserRequest request);
    AlterPasswordResponse alterPassword(AlterPasswordRequest request);
}  