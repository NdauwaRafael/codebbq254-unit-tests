package com.example.codebbq254unittests.service;

import com.example.codebbq254unittests.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }
}
