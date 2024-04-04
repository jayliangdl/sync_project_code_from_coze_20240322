package com.xxxx.GroupBuyActivity.dto.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class PlaceOrderRequest {
    @NotEmpty(message = "订单编号不能为空")
    private String orderId;

    @NotEmpty(message = "顾客编号不能为空")
    private String customerId;

    @NotEmpty(message = "下单时间不能为空")
    private String orderTime;
}