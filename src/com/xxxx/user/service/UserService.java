package com.xxxx.user.service;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.AlterPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.AlterPasswordResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public AddUserResponse addUser(AddUserRequest request) {
        //TODO 实现
        return new AddUserResponse();
    }
    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        //TODO 实现
        return new DeleteUserResponse();
    }
    @Override
    public AlterPasswordResponse alterPassword(AlterPasswordRequest request) {
        //TODO 实现
        return new AlterPasswordResponse();
    }
}  