package com.srt.dao;

import com.srt.entity.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(String teacherid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String teacherid);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}