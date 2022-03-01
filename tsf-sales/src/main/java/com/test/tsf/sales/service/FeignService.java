package com.test.tsf.sales.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 15:34
 */
@FeignClient(name = "tsf-goods")
public interface FeignService {
    @RequestMapping(value = "/goods/{str}", method = RequestMethod.GET)
    Object goods(@PathVariable("str") String str);
}
