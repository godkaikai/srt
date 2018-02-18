package com.srt.dao;

import com.srt.entity.form;

public interface formMapper {
    int deleteByPrimaryKey(String id);

    int insert(form record);

    int insertSelective(form record);

    form selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(form record);

    int updateByPrimaryKey(form record);
}