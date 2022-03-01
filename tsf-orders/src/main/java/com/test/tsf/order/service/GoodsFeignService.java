package com.test.tsf.order.service;

import com.test.tsf.order.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 15:34
 */
@FeignClient(name = "tsf-goods")
public interface GoodsFeignService {
    @RequestMapping(value = "/goods/{str}", method = RequestMethod.GET)
    Goods goods(@PathVariable("str") String str);
}
