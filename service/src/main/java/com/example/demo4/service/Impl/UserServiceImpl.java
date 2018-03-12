package com.example.demo4.service.Impl;

import com.example.demo4.dao.UserMapper;
import com.example.demo4.domain.User;
import com.example.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper um;

    @Override
    public List<User> findAll() {
        return um.findAll();
    }

    @Override
    public int save(User u) {
        return um.save(u);
    }
}
