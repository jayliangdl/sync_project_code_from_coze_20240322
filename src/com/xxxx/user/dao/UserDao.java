package com.xxxx.user.dao;

import com.xxxx.user.model.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * User DAO接口
 */
@Mapper
public interface UserDao {

    /**
     * 新增一个用户
     * @param user 用户信息
     * @return 操作结果，true-操作成功；false-操作失败
     */
    boolean addUser(@Param("user") UserDO user);

    /**
     * 修改一个用户信息
     * @param user 用户信息
     *             可修改用户名字、加密后密码、性别。仅修改这些字段；用户所有字段资料都是必填
     * @return 操作结果，true-操作成功；false-操作失败
     */
    boolean updateUser(@Param("user") UserDO user);

    /**
     * 删除一个用户信息
     * @param userId 用户ID
     * @return 操作结果，true-操作成功；false-操作失败
     */
    boolean deleteUser(@Param("userId") Long userId);

    /**
     * 依据用户ID或用户名字查询用户信息
     * @param userId 用户ID，可选参数（但用户ID和用户名字两者二选一，必须填入一个，否则抛出业务异常“查询的用户ID和用户名字必须传入一个”）
     * @param userName 用户名字，可选参数（但用户ID和用户名字两者二选一，必须填入一个，否则抛出业务异常“查询的用户ID和用户名字必须传入一个”）
     * @return 用户信息（包括用户所有字段信息）
     */
    UserDO getUser(@Param("userId") Long userId, @Param("userName") String userName);
}
