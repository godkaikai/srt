package com.srt.dao;

import com.srt.entity.admin;

public interface adminMapper {
    int deleteByPrimaryKey(String adminid);

    int insert(admin record);

    int insertSelective(admin record);

    admin selectByPrimaryKey(String adminid);

    int updateByPrimaryKeySelective(admin record);

    int updateByPrimaryKey(admin record);
}