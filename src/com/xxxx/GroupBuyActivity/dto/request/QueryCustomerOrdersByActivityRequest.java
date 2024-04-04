package com.xxxx.GroupBuyActivity.dto.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class QueryCustomerOrdersByActivityRequest {
    @NotEmpty(message = "活动编号不能为空")
    private String activityId;

    @NotEmpty(message = "顾客编号不能为空")
    @Size(max = 16, message = "顾客编号长度不能超过16位")
    private String customerId;

    private List<String> orderStatusList;

    private String orderId;

    @NotEmpty(message = "结果排序字段不能为空")
    private String sortField;

    @NotEmpty(message = "结果排序要求不能为空")
    @Pattern(regexp = "^(由大到小|由小到大)$", message = "结果排序要求应为'由大到小'或'由小到大'")
    private String sortOrder;

    @NotEmpty(message = "订单下单时间范围-开始日期时间不能为空")
    private String startTime;

    @NotEmpty(message = "订单下单时间范围-结束日期时间不能为空")
    private String endTime;
}