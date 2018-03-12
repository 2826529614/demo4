package com.example.demo4.service;

import com.example.demo4.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    int save(User u);
}
