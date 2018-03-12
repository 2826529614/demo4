package com.example.demo4.dao;

import com.example.demo4.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    int save(User u);
}
