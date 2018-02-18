package com.srt.dao;

import com.srt.entity.student;

public interface studentMapper {
    int deleteByPrimaryKey(Integer studentid);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer studentid);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}