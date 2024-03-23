package com.amway.user.dao;

import com.amway.user.dto.AddUserRequest;
import com.amway.user.dto.UpdateUserRequest;
import com.amway.user.dto.DeleteUserRequest;
import com.amway.user.dto.QueryUserRequest;
import com.amway.user.dto.AddUserResponse;
import com.amway.user.dto.UpdateUserResponse;
import com.amway.user.dto.DeleteUserResponse;
import com.amway.user.dto.QueryUserResponse;

public interface UserDao {

    int addUser(AddUserRequest request);

    int updateUser(UpdateUserRequest request);

    int deleteUser(DeleteUserRequest request);

    QueryUserResponse queryUser(QueryUserRequest request);

}