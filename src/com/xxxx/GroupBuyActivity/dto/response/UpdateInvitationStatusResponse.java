package com.xxxx.GroupBuyActivity.dto.response;

import lombok.Data;

@Data
public class UpdateInvitationStatusResponse {
    private boolean success;
    private ExceptionInfo exceptionInfo;

    @Data
    public static class ExceptionInfo {
        private String exceptionCode;
        private String exceptionMessage;
    }
}