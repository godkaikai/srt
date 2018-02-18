package com.srt.dao;

import com.srt.entity.course;

public interface courseMapper {
    int deleteByPrimaryKey(String courseid);

    int insert(course record);

    int insertSelective(course record);

    course selectByPrimaryKey(String courseid);

    int updateByPrimaryKeySelective(course record);

    int updateByPrimaryKey(course record);
}