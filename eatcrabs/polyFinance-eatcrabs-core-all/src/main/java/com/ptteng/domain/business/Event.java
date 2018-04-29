package com.ptteng.domain.business;

import java.io.Serializable;

public class Event implements Serializable {
    private Long id;
    private String title;
    private Integer aims;
    private String img;
    private Integer online;
    private Long createAt;
    private Long updateAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAims() {
        return aims;
    }

    public void setAims(Integer aims) {
        this.aims = aims;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
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
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", aims=" + aims +
                ", img='" + img + '\'' +
                ", online=" + online +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
