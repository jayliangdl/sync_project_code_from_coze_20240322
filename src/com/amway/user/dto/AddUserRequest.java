package com.amway.user.dto;

import lombok.Data;

@Data
public class AddUserRequest {
    
    private String userName;
    private String gender;
    private String status;
    private String psw;
    private Date createDatetime;
}