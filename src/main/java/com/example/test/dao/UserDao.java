package com.example.test.dao;

import com.example.test.entity.User;

public interface UserDao {
    User getUser(String name, String password);
}
