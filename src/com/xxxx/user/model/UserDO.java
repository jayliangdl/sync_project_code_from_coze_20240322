package com.xxxx.user.model;

import lombok.Data;


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