package com.xxxx.user.model;

import lombok.Data;
import java.sql.Timestamp;

/**
* 和uc_user数据表对应，用户的数据对象模型
*/
@Data
public class UserDO {
    /**
    * ID
    */
    private Integer id;

    /**
    * 用户名字
    */
    private String userName;

    /**
    * 性别 "1"-男 "2"-女
    */
    private char gender;

    /**
    * 拼团状态 "1"-有效 "2"-失效
    */
    private char status;

    /**
    * 加密后的用户密码信息
    */
    private String psw;

    /**
    * 记录创建时间
    */
    private Timestamp createDatetime;

    /**
    * 记录最后更新时间
    */
    private Timestamp updateDatetime;
}