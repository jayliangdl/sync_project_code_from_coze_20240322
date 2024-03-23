package com.amway.user.dao.impl;

import com.amway.user.dao.UserDao;
import com.amway.user.model.UserDO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserDaoImpl implements UserDao {

    private final SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Boolean createUser(UserDO userDO) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            int rows = session.insert("createUser", userDO);
            session.commit();
            return rows > 0;
        }
    }

    @Override
    public Boolean updateUser(UserDO userDO) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            int rows = session.update("updateUser", userDO);
            session.commit();
            return rows > 0;
        }
    }

    @Override
    public Boolean deleteUser(Integer userId) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            int rows = session.update("deleteUser", userId);
            session.commit();
            return rows > 0;
        }
    }

    @Override
    public UserDO queryUser(Integer userId, String userName) {
        if (userId == null && (userName == null || userName.isEmpty())) {
            throw new IllegalArgumentException("查询的用户ID和用户名字必须传入一个");
        }
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectOne("queryUser", new UserDO() {{
                setId(userId);
                setUserName(userName);
            }});
        }
    }
}
