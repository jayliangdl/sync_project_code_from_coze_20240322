package com.xxxx.user.dao;

import com.xxxx.user.model.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * UserDao
 *
 * @author AI Generated
 */
@Mapper
public interface UserDao {

    /**
     * DAO-NEW-USER-001
     * 新增一个用户
     *
     * @param userDO 用户信息
     * @return 添加成功的用户
     */
    UserDO createUser(@Param("userDO") UserDO userDO);

    /**
     * DAO-UPDATE-USER-001
     * 修改一个用户的信息
     *
     * @param userDO 用户信息
     * @return 是否修改成功
     */
    boolean updateUser(@Param("userDO") UserDO userDO);

    /**
     * DAO-DEL-USER-001
     * 删除一个用户
     *
     * @param id 用户的id
     * @return 是否删除成功
     */
    boolean deleteUser(@Param("id") Integer id);

    /**
     * DAO-QUERY-USER-001
     * 依据用户ID或用户名字查询用户信息
     *
     * @param id 用户id
     * @param userName 用户名
     * @return 用户信息
     */
    UserDO queryUser(@Param("id") Integer id, @Param("userName") String userName);
}