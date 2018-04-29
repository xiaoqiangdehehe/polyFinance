package com.ptteng.domain.business;

import java.io.Serializable;

/**
 * 产品信息表
 */
public class Product implements Serializable {
    private Long id;
    private String name;
    private String number;
    private Integer type;
    private Integer rate;
    private Integer term;
    private Integer least;
    private Integer step;
    private Integer quota;
    private Integer begin;
    private Integer repay;
    private Integer onsale;
    private String content;
    private Long createAt;
    private Long updateAt;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public void setLeast(Integer least) {
        this.least = least;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public void setRepay(Integer repay) {
        this.repay = repay;
    }

    public void setOnsale(Integer onsale) {
        this.onsale = onsale;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Integer getType() {
        return type;
    }

    public Integer getRate() {
        return rate;
    }

    public Integer getTerm() {
        return term;
    }

    public Integer getLeast() {
        return least;
    }

    public Integer getStep() {
        return step;
    }

    public Integer getQuota() {
        return quota;
    }

    public Integer getBegin() {
        return begin;
    }

    public Integer getRepay() {
        return repay;
    }

    public Integer getOnsale() {
        return onsale;
    }

    public String getContent() {
        return content;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", type=" + type +
                ", rate=" + rate +
                ", term=" + term +
                ", least=" + least +
                ", step=" + step +
                ", quota=" + quota +
                ", begin=" + begin +
                ", repay=" + repay +
                ", onsale=" + onsale +
                ", content='" + content + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
