package com.xxxx.user.dto.response;

import lombok.Data;

/**
 * 修改密码的返回结果对象，只包含操作结果
 */
@Data
public class UpdateUserPasswordResponse {

    /**
     * 操作结果
     */
    private boolean operationResult;
}