package com.dy.dao;

import com.dy.entity.User;

import java.util.List;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.13 11:13
 * @Description:
 */
public interface UserDao {
    public void insert(User user);
    public User findUserById (int userId);
    public List<User> findAllUsers();
}
