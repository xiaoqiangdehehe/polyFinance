package com.ptteng.domain.business;

import java.io.Serializable;

/**
 * 投资者账户信息表
 */
public class Depositor implements Serializable {
    private Long id;
    private Long userId;
    private Long total;
    private Long refund;
    private String confirm;
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

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return total;
    }

    public void setRefund(Long refund) {
        this.refund = refund;
    }

    public Long getRefund() {
        return refund;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    @Override
    public String toString() {
        return "BDepositor{" +
                "id = " + id +
                ", userId = " + userId +
                ", total = " + total +
                ", refund = " + refund +
                ", confirm = " + confirm +
                ", createAt = " + createAt +
                ", updateAt = " + updateAt +
                "}";
    }
}
