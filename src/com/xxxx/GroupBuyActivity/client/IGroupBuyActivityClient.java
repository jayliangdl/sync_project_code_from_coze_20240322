package com.xxxx.GroupBuyActivity.client;

import com.xxxx.GroupBuyActivity.dto.request.*;
import com.xxxx.GroupBuyActivity.dto.response.*;
import org.springframework.web.bind.annotation.*;
import javax.validation.*;

@RequestMapping("/GroupBuyActivity/")
public interface IGroupBuyActivityClient {

	@PostMapping("/checkCustomerActivityOrders")
	CheckCustomerActivityOrdersResponse checkCustomerActivityOrders(@Validated @RequestBody CheckCustomerActivityOrdersRequest checkCustomerActivityOrdersRequest);

	@PostMapping("/queryCustomerGroupBuyRecords")
	QueryCustomerGroupBuyRecordsResponse queryCustomerGroupBuyRecords(@Validated @RequestBody QueryCustomerGroupBuyRecordsRequest queryCustomerGroupBuyRecordsRequest);

	@PostMapping("/updateGroupBuyInvitation")
	UpdateGroupBuyInvitationResponse updateGroupBuyInvitation(@Validated @RequestBody UpdateGroupBuyInvitationRequest updateGroupBuyInvitationRequest);

	@PostMapping("/createNotPaidActivityOrder")
	CreateNotPaidActivityOrderResponse createNotPaidActivityOrder(@Validated @RequestBody CreateNotPaidActivityOrderRequest createNotPaidActivityOrderRequest);

}