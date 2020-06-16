/**
 * @description:
 * @author: Andy
 * @time: 2020/6/10 11:00
 */

package com.jinhao.ssmbyspringboot.pojo;

/**
 * @title: User
 * @projectName ssmbyspringboot
 * @description: TODO
 * @author zlh
 * @date 2020/6/1011:00
 */
public class User {
    private Integer id;
    private String username;
    private String sex;
    private String address;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}