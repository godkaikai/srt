package com.srt.dao;

import com.srt.entity.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(String courseid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String courseid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}