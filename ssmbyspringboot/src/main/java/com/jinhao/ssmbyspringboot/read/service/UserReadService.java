package com.jinhao.ssmbyspringboot.read.service;

import com.jinhao.ssmbyspringboot.pojo.User;

import java.util.List;

/**
 * @author zlh
 * @title: UserService
 * @projectName ssmbyspringboot
 * @description: TODO
 * @date 2020/6/1011:06
 */
public interface UserReadService {
    public User getUserById(Integer id);
    public List<User> getUserList();
}
