package com.srt.dao;

import com.srt.entity.StudyRoom;

public interface StudyRoomMapper {
    int deleteByPrimaryKey(String roomid);

    int insert(StudyRoom record);

    int insertSelective(StudyRoom record);

    StudyRoom selectByPrimaryKey(String roomid);

    int updateByPrimaryKeySelective(StudyRoom record);

    int updateByPrimaryKey(StudyRoom record);
}