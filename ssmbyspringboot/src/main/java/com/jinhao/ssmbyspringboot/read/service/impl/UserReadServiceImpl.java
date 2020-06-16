/**
 * @description:
 * @author: Andy
 * @time: 2020/6/10 11:07
 */

package com.jinhao.ssmbyspringboot.read.service.impl;

import com.jinhao.ssmbyspringboot.pojo.User;
import com.jinhao.ssmbyspringboot.read.mapper.UserReadMapper;
import com.jinhao.ssmbyspringboot.read.service.UserReadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: UserServiceImpl
 * @projectName ssmbyspringboot
 * @description: TODO
 * @author zlh
 * @date 2020/6/1011:07
 */
@Service
public class UserReadServiceImpl implements UserReadService {
    @Resource
    private UserReadMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.selectUserList();
    }
}