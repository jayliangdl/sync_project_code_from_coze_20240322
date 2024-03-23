package com.amway.user.model;

import lombok.Data;
import java.util.Date;

@Data
public class UserDO {

    private Integer id;
    private String userName;
    private String gender;
    private String status;
    private String psw;
    private Date createDatetime;
    private Date updateDatetime;
}