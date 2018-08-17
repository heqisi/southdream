package com.dy.dao;

import com.dy.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /*
    查询指定list包含的数量
     */
    public  int countByUserList(List<User> users);

    /*
    批量插入map中数据
     */
    public  void patchInsert(@Param("params")Map<String,String> usermap);
}
