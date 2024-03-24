package com.xxxx.user.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Data;

/**
 * 修改用户密码的请求对象，需要传递用户ID和新密码
 */
@Data
public class UpdateUserPasswordRequest {

    /**
     * 用户ID
     */
    @NotNull(message = "用户ID不能为空")
    private String userId;

    /**
     * 用户新密码
     */
    @NotNull(message = "用户新密码不能为空")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,16}$", message = "密码必须是6到16位，且至少包括一个字母和一个数字")
    private String newPassword;
}