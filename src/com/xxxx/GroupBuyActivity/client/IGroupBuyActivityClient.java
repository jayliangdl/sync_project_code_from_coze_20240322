package com.xxxx.GroupBuyActivity.client;

import com.xxxx.GroupBuyActivity.dto.request.*;
import com.xxxx.GroupBuyActivity.dto.response.*;
import org.springframework.web.bind.annotation.*;
import javax.validation.*;

@RequestMapping("/GroupBuyActivity/")
public interface IGroupBuyActivityClient {

    // 查询顾客是否下了某活动的订单
    @PostMapping("/checkCustomerActivityOrders")
    CheckCustomerActivityOrdersResponse checkCustomerActivityOrders(@Validated @RequestBody CheckCustomerActivityOrdersRequest checkCustomerActivityOrdersRequest);

    // 查询顾客所有以发起人身份发起过的拼团记录
    @PostMapping("/queryCustomerGroupBuyRecords")
    QueryCustomerGroupBuyRecordsResponse queryCustomerGroupBuyRecords(@Validated @RequestBody QueryCustomerGroupBuyRecordsRequest queryCustomerGroupBuyRecordsRequest);

    // 更新某受邀人已接受某拼团邀请
    @PostMapping("/updateGroupBuyInvitation")
    UpdateGroupBuyInvitationResponse updateGroupBuyInvitation(@Validated @RequestBody UpdateGroupBuyInvitationRequest updateGroupBuyInvitationRequest);

    // 下单(未支付)记录正向接口
    @PostMapping("/createNotPaidActivityOrder")
    CreateNotPaidActivityOrderResponse createNotPaidActivityOrder(@Validated @RequestBody CreateNotPaidActivityOrderRequest createNotPaidActivityOrderRequest);

}