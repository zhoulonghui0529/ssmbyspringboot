package com.jinhao.ssmbyspringboot;

import com.jinhao.ssmbyspringboot.read.service.UserReadService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SsmbyspringbootApplicationTests {
    @Resource
    private UserReadService userService;
    @Test
    void contextLoads() {
        System.out.println(userService.getUserById(1));
    }

}
