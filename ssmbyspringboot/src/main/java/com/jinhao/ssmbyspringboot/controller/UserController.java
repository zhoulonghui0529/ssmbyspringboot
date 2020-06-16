/**
 * @description:
 * @author: Andy
 * @time: 2020/6/10 10:50
 */

package com.jinhao.ssmbyspringboot.controller;

import com.jinhao.ssmbyspringboot.pojo.User;
import com.jinhao.ssmbyspringboot.read.service.UserReadService;
import com.jinhao.ssmbyspringboot.write.service.UserWriteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: UserController
 * @projectName ssmbyspringboot
 * @description: TODO
 * @author zlh
 * @date 2020/6/1010:50
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserReadService userReadService;
    @Resource
    private UserWriteService userWriteService;

    @GetMapping(value = "/query/id/{id}")
    public @ResponseBody User getUser(@PathVariable String id){
        return userReadService.getUserById(Integer.parseInt(id));
    }

    @GetMapping(value = "/query")
    public @ResponseBody List<User> getUserList(){
        return userReadService.getUserList();
    }

    @PostMapping(value = "/add")
    public void addUser(@RequestBody User user){
        System.out.println(user);
        userWriteService.addUser(user);
    }
}