package com.ptteng.domain.business;

import java.io.Serializable;

public class Debt implements Serializable {
    private Long id;
    private String name;
    private String idCard;
    private String number;
    private Integer rate;
    private Long amount;
    private Long match;
    private String content;
    private Long start;
    private Long finish;
    private Long createAt;

    @Override
    public String toString() {
        return "Debt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idCard='" + idCard + '\'' +
                ", number='" + number + '\'' +
                ", rate=" + rate +
                ", amount=" + amount +
                ", match=" + match +
                ", content='" + content + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                ", createAt=" + createAt +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getMatch() {
        return match;
    }

    public void setMatch(Long match) {
        this.match = match;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
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
}
