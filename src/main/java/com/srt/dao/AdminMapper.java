package com.srt.dao;

import com.srt.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(String adminid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String adminid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}