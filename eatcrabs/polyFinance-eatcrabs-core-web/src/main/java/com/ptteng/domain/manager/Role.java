package com.ptteng.domain.manager;

import javax.persistence.*;

/**
 * 角色表-manager
 */

@Entity//是指这个类映射有数据库表 javax.persistence.Entity 才可以移植
@Table(name = "s_role")//数据表名字
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", columnDefinition = "char(16)", nullable = false)
    private String name;
    @Column(name = "create_at", nullable = false)
    private Long createAt;
    @Column(name = "update_at")
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
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}

