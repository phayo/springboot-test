package com.springboot.test.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    void toGetUser() {
        assertEquals(userService.getUser(), "Ebuka");
    }
}