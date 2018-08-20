package com.dy.entity;

import com.dy.dao.SysUserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.17 17:57
 * @Description: 使用存储过程查询用户信息
 * https://blog.csdn.net/isea533/article/details/76358365
 */
public class SysUserTest {

    @Test
    public void testSelectUserById(){
        SqlSession sqlSession = ConnDB.getSessionFactory().openSession();//获取SqlSession的方法
        try {
            //这个例子的XML和接口都定义在UserMapper中
            SysUserDao userMapper = sqlSession.getMapper(SysUserDao.class);
            SysUser user = new SysUser();
            user.setId(1L);
            userMapper.selectUserById(user);
            Assert.assertNotNull(user.getUserName());
            System.out.println("用户名：" + user.getUserName()+"\n 邮箱： "+user.getUserEmail());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectUserPage(){
        SqlSession sqlSession = ConnDB.getSessionFactory().openSession();//获取SqlSession的方法
        try {
            SysUserDao userMapper = sqlSession.getMapper(SysUserDao.class);
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("userName", "ad");
            params.put("offset", 2);//
            params.put("limit", 10);
            System.out.println("1:"+params);
            List<SysUser> userList = userMapper.selectUserPage(params);
            System.out.println("2:"+params);//返回的total值放在params里面了
            Long total = (Long) params.get("total");
            System.out.println("总数:" + total);
            for(SysUser user : userList){
                System.out.println("用户名：" + user.getUserName());
            }
        } finally {
            sqlSession.close();
        }
    }
    /* mysql
    SELECT * FROM table LIMIT 5,10; // 检索记录行 6-15

    //如果只给定一个参数，它表示返回最大的记录行数目：
    mysql> SELECT * FROM table LIMIT 5; //检索前 5 个记录行

    //换句话说，LIMIT n 等价于 LIMIT 0,n。
     */
}
