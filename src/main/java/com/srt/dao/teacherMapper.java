package com.srt.dao;

import com.srt.entity.teacher;

public interface teacherMapper {
    int deleteByPrimaryKey(String teacherid);

    int insert(teacher record);

    int insertSelective(teacher record);

    teacher selectByPrimaryKey(String teacherid);

    int updateByPrimaryKeySelective(teacher record);

    int updateByPrimaryKey(teacher record);
}