package com.srt.dao;

import com.srt.entity.reply;

public interface replyMapper {
    int deleteByPrimaryKey(String reid);

    int insert(reply record);

    int insertSelective(reply record);

    reply selectByPrimaryKey(String reid);

    int updateByPrimaryKeySelective(reply record);

    int updateByPrimaryKey(reply record);
}