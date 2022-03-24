package com.lou.springboot.dao;

import com.lou.springboot.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAllUsers();

    int insertUser(User User);
    int updUser(User User);
    int delUser(Integer id);
    User getUserById(Integer id);
}
