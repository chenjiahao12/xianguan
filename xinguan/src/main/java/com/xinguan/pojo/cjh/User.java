package com.xinguan.pojo.cjh;

import lombok.ToString;

import java.util.Date;

@ToString
public class User {
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private Integer version;

    private Integer deleted;

    private Date create_time;

    private Date update_time;

    public User(Long id, String name, Integer age, String email, Integer version, Integer deleted, Date create_time, Date update_time) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.version = version;
        this.deleted = deleted;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public User() {
        super();
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}