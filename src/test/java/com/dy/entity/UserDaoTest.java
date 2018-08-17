package com.dy.entity;

import com.dy.dao.UserDao;
import com.mysql.jdbc.Connection;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.13 11:46
 * @Description:
 */
public class UserDaoTest {

    @Test
    public void findUserPratice() {
        SqlSession sqlSession = getSessionFactory().openSession();
        try {
            UserDao userMapper = sqlSession.getMapper(UserDao.class);
            User user = userMapper.findUserById(2);
            Assert.assertNotNull("没找到数据", user);
            System.out.println(user.getName());
            /*
            练习使用foreach--查询指定集合的数量
             */
            List<User> users = new ArrayList<User>();
            User user1 = new User();
            User user2 = new User();
            user1.setId(2);
            user2.setId(3);

            users.add(user1);
            users.add(user2);
            int count = userMapper.countByUserList(users);
            System.out.println("包含的数目为:"+count);

             /*
            练习使用foreach--批量插入数据
             */
            Map<String,String> usermap=new HashMap<String, String>();
            //Map usermap=new HashMap();
            usermap.put("8","user18");
            usermap.put("9","user19");
            userMapper.patchInsert(usermap);
            sqlSession.commit();

        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    //Mybatis 通过SqlSessionFactory获取SqlSession, 然后才能通过SqlSession与数据库进行交互
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "configuration.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources
                    .getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
