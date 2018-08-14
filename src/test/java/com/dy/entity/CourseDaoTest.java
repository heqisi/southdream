package com.dy.entity;

import com.dy.dao.CourseDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.14 14:17
 * @Description:
 */
public class CourseDaoTest {

    @Test
    public void findCourseById() {
        SqlSessionFactory sqlSessionFactory = getSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseDao courseDao = sqlSession.getMapper(CourseDao.class);
        Course course = courseDao.findCourseById(1);
        System.out.println(course.toString());
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
