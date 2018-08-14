package com.dy.dao;

import com.dy.entity.User;

import java.util.List;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.13 11:13
 * @Description:
 */
public interface UserDao {

    public User findUserById (int userId);

    public void insertUser (User user);

    public void updateUser (User user);

    public void deleteUser (User user);
}
