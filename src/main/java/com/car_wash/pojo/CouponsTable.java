package com.car_wash.pojo;

import java.util.Date;

public class CouponsTable {
    private Integer couponsId;

    private String couponsType;

    private Long couponsPrice;

    private Long couponsMoney;

    private Date couponsFailureTime;

    private String couponsMerchant;

    public Integer getCouponsId() {
        return couponsId;
    }

    public void setCouponsId(Integer couponsId) {
        this.couponsId = couponsId;
    }

    public String getCouponsType() {
        return couponsType;
    }

    public void setCouponsType(String couponsType) {
        this.couponsType = couponsType == null ? null : couponsType.trim();
    }

    public Long getCouponsPrice() {
        return couponsPrice;
    }

    public void setCouponsPrice(Long couponsPrice) {
        this.couponsPrice = couponsPrice;
    }

    public Long getCouponsMoney() {
        return couponsMoney;
    }

    public void setCouponsMoney(Long couponsMoney) {
        this.couponsMoney = couponsMoney;
    }

    public Date getCouponsFailureTime() {
        return couponsFailureTime;
    }

    public void setCouponsFailureTime(Date couponsFailureTime) {
        this.couponsFailureTime = couponsFailureTime;
    }

    public String getCouponsMerchant() {
        return couponsMerchant;
    }

    public void setCouponsMerchant(String couponsMerchant) {
        this.couponsMerchant = couponsMerchant == null ? null : couponsMerchant.trim();
    }
}