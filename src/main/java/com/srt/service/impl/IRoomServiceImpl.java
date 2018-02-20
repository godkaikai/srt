package com.srt.service.impl;

import com.srt.dao.RoomMapper;
import com.srt.entity.Room;
import com.srt.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Author:UpZzz
 * @Date:Created in 20:48 2018/2/20
 */
@Service(value = "iRoomService")
public class IRoomServiceImpl implements IRoomService{
    @Autowired
    private RoomMapper roomMapper;

    public List<Room> selectAllRoom(){
        return roomMapper.selectAllRoom();
    }

    public String addRoom(String roomid,String roomsize,String roomuse,String roomequipment,String roomposition,String note){
        Room room = new Room(roomid,roomsize,roomuse,roomequipment,roomposition,note);
        int row = roomMapper.insert(room);
        if(row == 1){
            return "添加成功";
        }
        return "添加失败，稍后重试";
    }

    public String updateRoom(String roomid,String roomsize,String roomuse,String roomequipment,String roomposition,String note){
        Room room = new Room(roomid,roomsize,roomuse,roomequipment,roomposition,note);
        int row = roomMapper.updateByPrimaryKey(room);
        if(row == 1){
            return "更新成功";
        }
        return "更新失败，稍后重试";
    }

    public String deleteRoom(String roomid){
        int row = roomMapper.deleteByPrimaryKey(roomid);
        if(row == 1){
            return "删除成功";
        }
        return "删除失败，稍后重试";
    }

}
