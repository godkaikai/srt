package com.srt.dao;

import com.srt.entity.Room;

public interface RoomMapper {
    int deleteByPrimaryKey(String roomid);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(String roomid);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}