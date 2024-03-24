package com.xxx.user.model;

import lombok.Data;
import java.util.Date;

/**
 * 用户领域对象
 */
@Data
public class UserDO {

    /** ID,自增,唯一键 */
    private Integer id;

    /** 用户名字,非空 */
    private String userName;

    /** 性别,非空  "1"-男 "2"-女 */
    private String gender;

    /** 拼团状态,枚举值 "1"-有效 "2"-失效 */
    private String status;

    /** 加密后的用户密码信息,非空 */
    private String psw;

    /** 记录创建时间,now() */
    private Date createDatetime;

    /** 记录最后更新时间,now() */
    private Date updateDatetime;
}