package com.ptteng.domain.business;

import java.io.Serializable;

/**
 * 投资者实名信息表
 */
public class Identity implements Serializable {
    private Long id;
    private Long userId;
    private String name;
    private String idCard;
    private Long createAt;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getCreateAt() {
        return createAt;
    }

    @Override
    public String toString() {
        return "BIdentity{" +
                "id = " + id +
                ", userId = " + userId +
                ", name = " + name +
                ", idCard = " + idCard +
                ", createAt = " + createAt +
                "}";
    }
}
