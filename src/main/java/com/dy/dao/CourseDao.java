package com.dy.dao;

import com.dy.entity.Course;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.14 14:02
 * @Description:
 */
public interface CourseDao {

    public Course findCourseById(int courseId);
}
