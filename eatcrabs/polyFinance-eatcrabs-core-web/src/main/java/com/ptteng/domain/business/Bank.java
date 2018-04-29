package com.ptteng.domain.business;

/**
 * 银行卡信息表
 */
public class Bank {
    private Long id;
    private String name;
    private String number;
    private Long single;
    private Long oneDay;
    private String icon;
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

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setSingle(Long single) {
        this.single = single;
    }

    public Long getSingle() {
        return single;
    }

    public void setOneDay(Long oneDay) {
        this.oneDay = oneDay;
    }

    public Long getOneDay() {
        return oneDay;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
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
        return "BBank{" +
                "id = " + id +
                ", name = " + name +
                ", number = " + number +
                ". single = " + single +
                ", oneDay = " + oneDay +
                ", icon = " + icon +
                ", createAt = " + createAt +
                ", updateAt = " + updateAt +
                "}";
    }

}
