package com.ptteng.domain.business;

/**
 * 超管表-manager
 */
public class Root {
    private Long id;
    private String account;
    private String key;
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
        return "SRoot{" +
                "id = " + id +
                ", account = " + account +
                ". key = " + key +
                ", createAt = " + createAt +
                ". updateAt = " + updateAt +
                "}";
    }
}
