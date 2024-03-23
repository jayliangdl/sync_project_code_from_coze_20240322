package com.xxxx.user.dto.request;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class DeleteUserRequest {
    @NotBlank(message = "用户ID不能为空")
    private String userId;
}