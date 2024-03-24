package com.xxxx.user.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Data;

/**
 * 新增用户的请求对象，用于传递用户的基本信息
 */
@Data
public class AddUserRequest {

    /**
     * 用户名字
     */
    @NotNull(message = "用户名字不能为空")
    private String username;
    
    /**
     * 用户密码
     */
    @NotNull(message = "用户密码不能为空")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,16}$", message = "密码必须是6到16位，且至少包括一个字母和一个数字")
    private String password;
    
    /**
     * 用户性别
     */
    @NotNull(message = "用户性别不能为空")
    @Pattern(regexp = "^[12]$", message = "性别只能为 '1'(男) 或 '2'(女)")
    private String gender;
}