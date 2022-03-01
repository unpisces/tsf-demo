package com.test.tsf.sales.entity;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 15:16
 */
public class Sales {

    private String salesId;
    private String goodsId;
    private double discount;

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
