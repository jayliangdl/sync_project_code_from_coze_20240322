package com.xxxx.user.dto.request;

import lombok.Data;

@Data
public class UpdateUserPasswordRequest {

    private String username;

    private String newPassword;
    
}