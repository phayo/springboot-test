package com.springboot.test.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String getUser(){
        return "Ebuka";
    }
}
