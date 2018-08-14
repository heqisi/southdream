package com.dy.dao;

import com.dy.entity.Student;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.14 14:02
 * @Description:
 */
public interface StudentDao {

    public Student findStudentById(String idCard);
}
