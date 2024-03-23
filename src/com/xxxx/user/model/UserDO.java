package com.xxxx.user.model;

import lombok.Data;

import java.util.Date;

/**
 * UserDO是对uc_user表的映射类，包含用户信息。
 */
@Data
public class UserDO {
    /**
     * 用户ID，自增，唯一键
     */
    private Integer id;
    
    /**
     * 用户名字，非空
     */
    private String userName;
    
    /**
     * 性别，非空，"1"-男 "2"-女
     */
    private String gender;
    
    /**
     * 用户状态，枚举值
     * "1"-有效
     * "2"-失效
     */
    private String status;
    
    /**
     * 加密后的用户密码信息，非空
     */
    private String psw;
    
    /**
     * 记录创建时间，默认值now()
     */
    private Date createDatetime;
    
    /**
     * 记录最后更新时间，默认值now()
     */
    private Date updateDatetime;
}