package com.test.tsf.goods.controller;

import com.test.tsf.goods.entity.Goods;
import com.test.tsf.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 14:47
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/{goodId}", method = RequestMethod.GET)
    public Goods getGoodsId(@PathVariable String goodId) {
        return goodsService.getGoodsById(goodId);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Goods> testRegion() {
        return goodsService.list();
    }

}
