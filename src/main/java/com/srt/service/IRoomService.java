package com.srt.service;

import com.srt.entity.Room;

import java.util.List;

/**
 * @Author:UpZzz
 * @Date:Created in 20:47 2018/2/20
 */
public interface IRoomService {
    String addRoom(String roomid,String roomsize,String roomuse,String roomequipment,String roomposition,String note);

    List<Room> selectAllRoom();

    String updateRoom(String roomid,String roomsize,String roomuse,String roomequipment,String roomposition,String note);

    String deleteRoom(String roomid);
}
