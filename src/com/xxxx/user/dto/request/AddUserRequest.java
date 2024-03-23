package com.xxxx.user.dto.request;

import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 * 新增用户请求参数类
 */
@Validated
@Data
public class AddUserRequest {

    /**
     * 用户名字
     */
    @NotNull(message = "用户名字不能为空")
    private String userName;

    /**
     * 用户密码
     */
    @NotNull(message = "用户密码不能为空")
    @Size(min = 6, max = 16, message = "用户密码必须6-16位")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$", message = "密码至少6位，必须包含至少一个数字和一个字母")
    private String password;

    /**
     * 用户性别
     */
    @NotNull(message = "用户性别不能为空")
    @Pattern(regexp = "[1-2]{1}", message = "用户性别必须为'1'(男性)或'2'(女性)")
    private String sex;
}