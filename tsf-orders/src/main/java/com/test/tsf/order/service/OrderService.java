package com.test.tsf.order.service;

import com.test.tsf.order.entity.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 16:10
 */
@Component
public class OrderService {
    private List<Orders> list = new ArrayList<>();

    private void create(){
        for (int i = 0; i < 10; i++) {
            Orders s = new Orders();
            s.setOrdersId("orders-"+i);
            s.setUserID("user-"+i);

            List<GoodNum> goodNums = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                GoodNum goodNum = new GoodNum();
                goodNum.setGoodsId("goods-"+j);
                goodNum.setNumber(3);
                goodNums.add(goodNum);
            }
            s.setGoods(goodNums);
            list.add(s);
        }
    }

    public Orders getOrdersById(String id){
        create();
        for (Orders s: list) {
            if (id.equals(s.getOrdersId())){
                return s;
            }
        }
        return null;
    }

    public List<UserTotal> report (){
        List<UserTotal> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserTotal userTotal = new UserTotal();
            userTotal.setUserId("user-"+i);
            userTotal.setTotal((i+1) * 100);
            list.add(userTotal);
        }
        return list;
    }


}
