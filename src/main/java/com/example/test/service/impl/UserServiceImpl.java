package com.example.test.service.impl;

import com.example.test.dao.UserDao;
import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User loginIn(String name, String password) {
        User user = userDao.getUser(name, password);
        return user;
    }
}
