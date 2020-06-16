/**
 * @description:
 * @author: Andy
 * @time: 2020/6/16 11:25
 */

package com.jinhao.ssmbyspringboot.write.service.impl;

import com.jinhao.ssmbyspringboot.pojo.User;
import com.jinhao.ssmbyspringboot.write.mapper.UserWriteMapper;
import com.jinhao.ssmbyspringboot.write.service.UserWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @title: UserWriteServiceImpl
 * @projectName ssmbyspringboot
 * @description: TODO
 * @author zlh
 * @date 2020/6/1611:25
 */
@Service
public class UserWriteServiceImpl implements UserWriteService {
    @Resource
    private UserWriteMapper userWriteMapper;
    @Override
    public void addUser(User user) {
        userWriteMapper.insert(user);
    }
}