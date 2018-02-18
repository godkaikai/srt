package com.srt.dao;

import com.srt.entity.Form;

public interface FormMapper {
    int deleteByPrimaryKey(String id);

    int insert(Form record);

    int insertSelective(Form record);

    Form selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Form record);

    int updateByPrimaryKey(Form record);
}