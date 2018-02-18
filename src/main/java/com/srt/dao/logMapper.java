package com.srt.dao;

import com.srt.entity.log;

public interface logMapper {
    int deleteByPrimaryKey(String id);

    int insert(log record);

    int insertSelective(log record);

    log selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(log record);

    int updateByPrimaryKey(log record);
}