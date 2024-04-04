package com.xxxx.GroupBuyActivity.dto.request;

import lombok.Data;
import java.util.List;

@Data
public class QueryCustomerOrdersByActivityRequest {
    /**
     * 活动编号
     */
    private String activityId;
    
    /**
     * 顾客编号
     */
    private String customerId;
    
    /**
     * 订单状态条件列表
     */
    private List<String> orderStatusList;
    
    /**
     * 订单号
     */
    private String orderId;
    
    /**
     * 结果排序字段
     */
    private String sortField;
    
    /**
     * 结果排序要求
     */
    private String sortOrder;
    
    /**
     * 订单下单时间范围-开始日期时间
     */
    private String startTime;
    
    /**
     * 订单下单时间范围-结束日期时间
     */
    private String endTime;
}