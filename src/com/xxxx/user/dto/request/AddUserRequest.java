package com.xxxx.user.dto.request;

import lombok.Data;
import javax.validation.constraints.*;

@Data
public class AddUserRequest {
   
    @NotBlank(message = "用户名字不能为空")
    private String username;

    @NotEmpty(message = "用户密码不能为空")
    @Size(max = 16, min = 6, message = "用户密码在6-16个字符之间")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])", message = "用户密码需要数字和字母混合")
    private String password;
 
    @NotBlank(message = "用户性别不能为空")
    @Pattern(regexp = "^[1-2]$", message = "只能填写1或2") 
    private String gender;
}