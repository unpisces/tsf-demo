package com.test.tsf.sales.controller;

import com.test.tsf.sales.entity.Sales;
import com.test.tsf.sales.service.FeignService;
import com.test.tsf.sales.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 15:14
 */
@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/{goodId}", method = RequestMethod.GET)
    public Sales getGoodsId(@PathVariable String goodId) {
        return salesService.getSalesById(goodId);
    }

    @PostMapping(value = "/increase")
    public boolean increase(@RequestBody Sales sales) {
        if (sales == null) return false;
        Object object = feignService.goods(sales.getGoodsId());
        if (object == null){
            return false;
        }
        return salesService.increase(sales);
    }

    @PostMapping(value = "/decrease")
    public boolean decrease(@RequestBody Sales sales) {
        if (sales == null) return false;
        Object object = feignService.goods(sales.getGoodsId());
        if (object == null){
            return false;
        }
        return salesService.decrease(sales.getSalesId());
    }
}
