package com.ptteng.domain;

/**
 * 员工表-manager
 */
public class Staff {
    private Long id;
    private String account;
    private String key;
    private String mobile;
    private Long roleId;
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

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getRoleId() {
        return roleId;
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
        return "SStaff{" +
                "id = " + id +
                ", account = " + account +
                ", key = " + key +
                ", mobile = " + mobile +
                ", roleId = " + roleId +
                ", createAt = " + createAt +
                ", updateAt = " + updateAt +
                "}";
    }
}
