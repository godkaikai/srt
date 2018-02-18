package com.srt.dao;

import com.srt.entity.studyroom;

public interface studyroomMapper {
    int deleteByPrimaryKey(String roomid);

    int insert(studyroom record);

    int insertSelective(studyroom record);

    studyroom selectByPrimaryKey(String roomid);

    int updateByPrimaryKeySelective(studyroom record);

    int updateByPrimaryKey(studyroom record);
}