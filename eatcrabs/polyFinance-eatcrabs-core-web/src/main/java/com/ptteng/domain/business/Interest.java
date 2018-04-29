package com.ptteng.domain.business;

import java.io.Serializable;

public class Interest implements Serializable {
    private Long id;
    private Long userId;
    private Integer amount;
    private Integer rate;
    private Integer repay;
    private Long start;
    private Long lastRefund;
    private Long nextRefund;
    private Long finish;
    private Long createAt;
    private Long updateAt;

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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getRepay() {
        return repay;
    }

    public void setRepay(Integer repay) {
        this.repay = repay;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getLastRefund() {
        return lastRefund;
    }

    public void setLastRefund(Long lastRefund) {
        this.lastRefund = lastRefund;
    }

    public Long getNextRefund() {
        return nextRefund;
    }

    public void setNextRefund(Long nextRefund) {
        this.nextRefund = nextRefund;
    }

    public Long getFinish() {
        return finish;
    }

    public void setFinish(Long finish) {
        this.finish = finish;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Interest{" +
                "id=" + id +
                ", userId=" + userId +
                ", amount=" + amount +
                ", rate=" + rate +
                ", repay=" + repay +
                ", start=" + start +
                ", lastRefund=" + lastRefund +
                ", nextRefund=" + nextRefund +
                ", finish=" + finish +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
