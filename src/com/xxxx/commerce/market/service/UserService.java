package com.xxxx.commerce.market.service;

import com.xxxx.commerce.market.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserService {

    boolean deleteUser(String userId);

    boolean updateUserPassword(String userId, String newPassword);
}

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean deleteUser(String userId) {
        // 实现删除用户的代码
    }

    @Override
    public boolean updateUserPassword(String userId, String newPassword) {
        // 实现修改用户密码的代码
    }
}
