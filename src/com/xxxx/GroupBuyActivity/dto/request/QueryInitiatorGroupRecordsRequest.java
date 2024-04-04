package com.xxxx.GroupBuyActivity.dto.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class QueryInitiatorGroupRecordsRequest {
    @NotEmpty(message = "活动编号不能为空")
    private String activityId;

    @NotEmpty(message = "顾客编号不能为空")
    private String customerId;

    private List<String> orderStatusList;

    private String sortField;

    private String sortOrder;
}