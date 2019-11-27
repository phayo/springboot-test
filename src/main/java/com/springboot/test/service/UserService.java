package com.springboot.test.service;

import com.springboot.test.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserDao userDao;

    public String getUser(){
        return userDao.getUser();
    }
}
