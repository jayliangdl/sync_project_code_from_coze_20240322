package com.xxxx.user.dto.response;

import lombok.Data;

/**
 * 删除用户的返回结果对象，只包含操作结果
 */
@Data
public class DeleteUserResponse {

    /**
     * 操作结果
     */
    private boolean operationResult;
}