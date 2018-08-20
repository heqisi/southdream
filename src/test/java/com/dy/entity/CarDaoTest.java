package com.dy.entity;

import com.dy.dao.CarDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.16 15:04
 * @Description:
 */
public class CarDaoTest {

    @Test
    public void shouldGetAllCars() {
        SqlSession sqlSession = ConnDB.getSessionFactory().openSession();
        try {
            CarDao car = sqlSession.getMapper(CarDao.class);
            List<Car> cars = car.getCar();
            int size=cars.size();
            for (int i=0;i<size;i++) {
                Car car1=cars.get(i);
                System.out.println(car1.getBrakes().getBrakestype());
            }
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
