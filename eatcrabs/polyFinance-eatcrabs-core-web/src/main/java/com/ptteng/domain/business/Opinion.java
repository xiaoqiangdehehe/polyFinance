package com.ptteng.domain.business;

import java.io.Serializable;

public class Opinion implements Serializable {
    private Long id;
    private String name;
    private String acoount;
    private String content;
    private String number;
    private Long createAt;

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

    public String getAcoount() {
        return acoount;
    }

    public void setAcoount(String acoount) {
        this.acoount = acoount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Opinion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acoount='" + acoount + '\'' +
                ", content='" + content + '\'' +
                ", number='" + number + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
