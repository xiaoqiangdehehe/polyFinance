package com.ptteng.domain.manager;

/**
 * 模块表-manager
 */
public class SModule {
    private Long id;
    private String name;
    private Long fmoduleId;
    private String url;
    private Long createAt;
    private Long updateAt;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFmoduleId(Long fmoduleId) {
        this.fmoduleId = fmoduleId;
    }

    public Long getFmoduleId() {
        return fmoduleId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getCreateAt() {
        return createAt;
    }

    @Override
    public String toString() {
        return "SModule{" +
                "id = " + id +
                ", name = " + name +
                ", fmoduleId = " + fmoduleId +
                ", url = " + url +
                ", createAt = " + createAt +
                ", upeateAt = " + updateAt +
                "}";
    }

}
