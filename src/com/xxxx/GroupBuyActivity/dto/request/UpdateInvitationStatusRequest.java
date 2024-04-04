package com.xxxx.GroupBuyActivity.dto.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UpdateInvitationStatusRequest {
    @NotEmpty(message = "团编号不能为空")
    private String groupId;

    @NotEmpty(message = "发起人顾客编号不能为空")
    private String initiatorId;

    @NotEmpty(message = "受邀人顾客编号不能为空")
    private String invitedUserId;
}