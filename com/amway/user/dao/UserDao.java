package com.amway.user.dao;

import com.amway.user.model.UserDO;

public interface UserDao {

    Boolean createUser(UserDO userDO);

    Boolean updateUser(UserDO userDO);

    Boolean deleteUser(Integer userId);

    UserDO queryUser(Integer userId, String userName);
}