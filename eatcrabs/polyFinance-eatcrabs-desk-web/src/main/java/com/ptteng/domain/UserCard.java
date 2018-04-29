package com.ptteng.domain;

/**
 * 投资者绑卡信息表
 */
public class UserCard {
    private Long id;
    private Long userId;
    private String bankCard;
    private String bankName;
    private String bankNumber;
    private String bankMobile;
    private Long createAt;
    private Long updateAt;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile;
    }

    public String getBankMobile() {
        return bankMobile;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    @Override
    public String toString() {
        return "BUserCared{" +
                "id = " + id +
                ", userId = " + userId +
                ", bankCard = " + bankCard +
                ", bankName = " + bankName +
                ", bankNumber =" + bankNumber +
                ", bankMobile = " + bankMobile +
                ", createAt = " + createAt +
                ", updateAt = " + updateAt +
                "}";
    }
}
