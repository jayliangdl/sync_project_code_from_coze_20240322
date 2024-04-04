package com.xxxx.GroupBuyActivity.dto.response;

import lombok.Data;
import java.util.List;

@Data
public class QueryCustomerOrdersByActivityResponse {
    /**
     * 订单列表
     */
    private List<Order> orders;
    
    @Data
    public static class Order {
        /**
         * 订单号
         */
        private String orderId;
        
         /**
         * 订单状态
         */
        private String orderStatus;
        
         /**
         * 下单时间
         */
        private String orderTime;
        
         /**
         * 购货人编号
         */
        private String customerId;
    }
}