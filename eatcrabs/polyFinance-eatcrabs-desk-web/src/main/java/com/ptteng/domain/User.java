package com.ptteng.domain;

/**
 * 投资者登陆信息表
 */
public class User {
    private Long id;
    private String account;
    private String key;
    private String gesture;
    private String number;
    private Integer freeze;
    private Long createAt;
    private Long updateAt;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setGesture(String gesture) {
        this.gesture = gesture;
    }

    public String getGesture() {
        return gesture;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setFreeze(Integer freeze) {
        this.freeze = freeze;
    }

    public Integer getFreeze() {
        return freeze;
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
    public String toString(){
        return "SUser{" +
                "id = " + id +
                ", account = " + account +
                ", key = " + key +
                ", gesture = " + gesture +
                ", number = " + number +
                ", freeze = " + freeze +
                ", createAt = " + createAt +
                ", updateAt = " + updateAt +
                "}";
    }
}
