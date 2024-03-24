package com.xxxx.user.model;

import lombok.Data;
import java.util.Date;

@Data
/** "UserDO" 数据对象类：这个类对应数据库表 "uc_user"，这个类包含所有字段，并且可以被用来进行数据传输以及映射。 */
public class UserDO {

    /** ID 字段： 这是数据库表的ID字段，自动递增，唯一键 */
    private Integer id;

    /** userName 字段：这是“用户名称”，不能为空 */
    private String userName;

    /** gender 字段： 这是“性别”，不能为空，1-男，2-女 */
    private String gender;

    /** status 字段： 这是“拼团状态”，可以有多个枚举值（1-有效，2-失效） */
    private String status;

    /** psw 字段： 这是“加密后的用户密码信息”，非空 */
    private String psw;

    /** createDatetime 字段： 这是记录的创建时间，默认值是NOW() */
    private Date createDatetime;

    /** updateDatetime 字段： 这是记录最后更新的时间，默认值是NOW() */
    private Date updateDatetime;
}