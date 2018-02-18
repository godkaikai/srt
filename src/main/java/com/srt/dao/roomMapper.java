package com.srt.dao;

import com.srt.entity.room;

public interface roomMapper {
    int deleteByPrimaryKey(String roomid);

    int insert(room record);

    int insertSelective(room record);

    room selectByPrimaryKey(String roomid);

    int updateByPrimaryKeySelective(room record);

    int updateByPrimaryKey(room record);
}