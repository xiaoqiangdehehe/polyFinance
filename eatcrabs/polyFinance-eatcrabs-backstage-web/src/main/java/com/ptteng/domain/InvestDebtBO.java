package com.ptteng.domain;

public class InvestDebtBO {
    private Long id;
    private Long investId;
    private Long debtId;
    private Long createAt;

    @Override
    public String toString() {
        return "InvestDebtBO{" +
                "id=" + id +
                ", investId=" + investId +
                ", debtId=" + debtId +
                ", createAt=" + createAt +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInvestId() {
        return investId;
    }

    public void setInvestId(Long investId) {
        this.investId = investId;
    }

    public Long getDebtId() {
        return debtId;
    }

    public void setDebtId(Long debtId) {
        this.debtId = debtId;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }
}
