package com.example.test.service;

import com.example.test.entity.User;

public interface UserService {
    User loginIn(String name, String password);
}
