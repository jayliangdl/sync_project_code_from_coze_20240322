package com.xxxx.user.dao;

import com.xxxx.user.model.UserDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * UserDao是用户操作的数据访问对象接口。
 * 提供访问用户信息的方法，包括增删改查。
 */
public interface UserDao {
    
    /**
     * 向数据库插入一个新用户。
     * 文档编码: [请替换为实际的文档编码]
     * @param userDO 用户DO对象
     * @return 影响的行数
     */
    @Insert("INSERT INTO uc_user(userName, gender, status, psw, create_datetime, update_datetime) VALUES (#{userName}, #{gender}, #{status}, #{psw}, NOW(), NOW())")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUser(UserDO userDO);

    /**
     * 根据用户ID更新用户信息。
     * 文档编码: [请替换为实际的文档编码]
     * @param userDO 用户DO对象
     * @return 影响的行数
     */
    @Update("UPDATE uc_user SET userName = #{userName}, gender = #{gender}, status = #{status}, psw = #{psw}, update_datetime = NOW() WHERE id = #{id}")
    int updateUser(UserDO userDO);

    /**
     * 根据用户ID删除用户信息。
     * 文档编码: [请替换为实际的文档编码]
     * @param id 用户ID
     * @return 影响的行数
     */
    @Delete("DELETE FROM uc_user WHERE id = #{id}")
    int deleteUser(Integer id);

    /**
     * 查询所有用户信息。
     * 文档编码: [请替换为实际的文档编码]
     * @return 用户信息列表
     */
    @Select("SELECT id, userName, gender, status, psw, create_datetime, update_datetime FROM uc_user")
    @ResultMap("userResultMap")
    List<UserDO> queryAllUsers();
    
    // TODO: 其他需要的用户操作方法
}
