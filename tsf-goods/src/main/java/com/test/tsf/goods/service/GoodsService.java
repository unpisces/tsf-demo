package com.test.tsf.goods.service;

import com.test.tsf.goods.entity.Goods;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 14:52
 */
@Component
public class GoodsService {

    private List<Goods> list = new ArrayList<>();

    private void create(){
        for (int i = 0; i < 25; i++) {
            Goods goods = new Goods();
            goods.setGoodsId("goods-" + i);
            goods.setGoodsName("goodsName-" + i);
            goods.setGoodsPrices(10);
            list.add(goods);
        }
    }

    public Goods getGoodsById(String goodsId){
        create();
        for (Goods goods: list) {
            if (goodsId.equals(goods.getGoodsId())){
                return goods;
            }
        }
        return null;
    }

    public List<Goods> list(){
        create();
        return list;
    }

}
