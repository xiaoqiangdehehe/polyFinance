package com.ptteng.domain.business;

import java.io.Serializable;

public class DealRecord implements Serializable {
    private Long id;
    private Long userId;
    private String userMoblie;
    private String userName;
    private String number;
    private String productName;
    private Integer pay;
    private Integer success;
    private String dealBy;
    private Long createAt;

    @Override
    public String toString() {
        return "DealRecord{" +
                "id=" + id +
                ", userId=" + userId +
                ", userMoblie='" + userMoblie + '\'' +
                ", userName='" + userName + '\'' +
                ", number='" + number + '\'' +
                ", productName='" + productName + '\'' +
                ", pay=" + pay +
                ", success=" + success +
                ", dealBy='" + dealBy + '\'' +
                ", createAt=" + createAt +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserMoblie() {
        return userMoblie;
    }

    public void setUserMoblie(String userMoblie) {
        this.userMoblie = userMoblie;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getDealBy() {
        return dealBy;
    }

    public void setDealBy(String dealBy) {
        this.dealBy = dealBy;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }
}
