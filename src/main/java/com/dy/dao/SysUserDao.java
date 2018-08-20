package com.dy.dao;

import com.dy.entity.SysUser;

import java.util.List;
import java.util.Map;

/*
 * @Auther: yuanmaojun
 * @Date: 2018.8.17 17:55
 * @Description: 使用存储过程查询用户信息
 * https://blog.csdn.net/isea533/article/details/76358365
 */
public interface SysUserDao {

    void selectUserById(SysUser user);

    /*
     * 使用存储过程分页查询
     *
     * @param userName
     * @param pageNum
     * @param pageSize
     * @param total
     * @return
     */
    List<SysUser> selectUserPage(Map<String, Object> params);
}
