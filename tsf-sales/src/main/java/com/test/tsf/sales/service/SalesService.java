package com.test.tsf.sales.service;

import com.test.tsf.sales.entity.Sales;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 15:17
 */
@Component
public class SalesService {

    private List<Sales> list = new ArrayList<>();

    private void create(){
        for (int i = 0; i < 10; i++) {
            Sales s = new Sales();
            s.setSalesId("sales-"+i);
            s.setGoodsId("goods-"+i);
            s.setDiscount(0.8);
            list.add(s);
        }
    }

    public Sales getSalesById(String id){
        create();
        for (Sales s: list) {
            if (id.equals(s.getGoodsId())){
                return s;
            }
        }
        return null;
    }

    public boolean increase(Sales sales){
        return true;
    }

    public boolean decrease(String salesId){
        return true;
    }

}
