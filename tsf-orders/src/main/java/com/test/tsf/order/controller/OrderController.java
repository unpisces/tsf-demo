package com.test.tsf.order.controller;

import com.test.tsf.order.entity.*;
import com.test.tsf.order.service.GoodsFeignService;
import com.test.tsf.order.service.OrderService;
import com.test.tsf.order.service.SalesFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 15:44
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private GoodsFeignService goodsFeignService;

    @Autowired
    private SalesFeignService salesFeignService;

    @Autowired
    private OrderService orderService;

    @Value("${maxBuyNumber:10}")
    private int maxBuyNumber = 10;

    @PostMapping(value = "/buy")
    public Map<String, Double> buy(@RequestBody Orders orders) {
        Map<String, Double> result = new HashMap<>();
        double num = 0.0;
        if (orders == null) return null;

        List<GoodNum> GoodNumList = orders.getGoods();
        if (GoodNumList == null) return null;
        for (GoodNum g : orders.getGoods()){
            Goods goods = goodsFeignService.goods(g.getGoodsId());

            if (g.getNumber() > 10){
                result.put("商品超卖", 0.0);
                return  result;
            }

            if (goods == null){
                result.put("商品不存在", 0.0);
                return  result;
            }
            Sales sales = salesFeignService.goods(g.getGoodsId());

            if (sales != null){
                num += goods.getGoodsPrices() * g.getNumber() * sales.getDiscount();
            }else {
                num += goods.getGoodsPrices() * g.getNumber();
            }
        }
        result.put("totan", num);
        return result;
    }

    @RequestMapping(value = "/{orders}", method = RequestMethod.GET)
    public Orders orders(@PathVariable String orders) {
        return orderService.getOrdersById(orders);
    }


    @RequestMapping(value = "/report", method = RequestMethod.GET)
    public List<UserTotal> report() {
        return orderService.report();
    }


}
