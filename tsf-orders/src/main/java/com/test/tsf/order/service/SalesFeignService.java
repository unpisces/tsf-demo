package com.test.tsf.order.service;

import com.test.tsf.order.entity.Sales;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 15:34
 */
@FeignClient(name = "tsf-sales")
public interface SalesFeignService {
    @RequestMapping(value = "/sales/{str}", method = RequestMethod.GET)
    Sales goods(@PathVariable("str") String str);
}
