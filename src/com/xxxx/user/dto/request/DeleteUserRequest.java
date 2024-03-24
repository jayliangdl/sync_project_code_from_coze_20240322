package com.xxxx.user.dto.request;

import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 删除用户的请求对象，只需要传递用户ID
 */
@Data
public class DeleteUserRequest {

    /**
     * 用户ID
     */
    @NotNull(message = "用户ID不能为空")
    private String userId;
}