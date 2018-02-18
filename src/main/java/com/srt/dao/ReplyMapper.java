package com.srt.dao;

import com.srt.entity.Reply;

public interface ReplyMapper {
    int deleteByPrimaryKey(String reid);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(String reid);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
}