// Here is the content of UserOperationServiceImpl.java

package com.xxxx.user.service.impl;

import com.xxxx.user.dao.UcUserDao;
import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.UpdateUserPasswordRequest;
import com.xxxx.user.service.UserOperationService;

public class UserOperationServiceImpl implements UserOperationService {

    private final UcUserDao ucUserDao;

    public UserOperationServiceImpl(UcUserDao ucUserDao) {
        this.ucUserDao = ucUserDao;
    }

    // Implementations of addUser, updateUserPassword, and other methods would go here
}