package com.test.tsf.order.entity;

import java.util.List;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 15:48
 */
public class Orders {

    private String ordersId;
    private String userID;
    private List<GoodNum> goods;

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public List<GoodNum> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodNum> goods) {
        this.goods = goods;
    }
}
