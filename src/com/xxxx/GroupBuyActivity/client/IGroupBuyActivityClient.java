package com.xxxx.GroupBuyActivity.client;

import com.xxxx.GroupBuyActivity.dto.request.QueryCustomerOrdersByActivityRequest;
import com.xxxx.GroupBuyActivity.dto.response.QueryCustomerOrdersByActivityResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/GroupBuyActivity")
@Validated
public interface IGroupBuyActivityClient {

    @PostMapping("/queryCustomerOrdersByActivity")
    QueryCustomerOrdersByActivityResponse queryCustomerOrdersByActivity(@RequestBody @Valid QueryCustomerOrdersByActivityRequest request);

    // TODO: Add other API methods

}
