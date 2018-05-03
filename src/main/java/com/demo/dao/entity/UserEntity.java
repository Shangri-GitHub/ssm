package com.demo.dao.entity;

/**
 * 用户实体类
 *
 * @author Wwwwei
 */
public class UserEntity {
    private Integer id; //用户id
    private String name;//用户名
    private String password;//用户密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
