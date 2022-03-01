package com.test.tsf.order.entity;

/**
 * @Author: unpisces
 * @Date: 2022/1/22 16:16
 */
public class UserTotal {
    private String userId;
    private double total;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
