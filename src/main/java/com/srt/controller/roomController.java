package com.srt.controller;

import com.srt.entity.Room;
import com.srt.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:UpZzz
 * @Date:Created in 17:57 2018/2/20
 */
@Controller
@RequestMapping("/room/")
public class roomController {
    @Autowired
    private IRoomService iRoomService;

    @RequestMapping(value = "getRoomListView",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView getRoomListView(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("roomList.jsp");
        request.setAttribute("roomList",iRoomService.selectAllRoom());
        return mv;
    }

    @RequestMapping(value = "getRoomList",method = RequestMethod.POST)
    @ResponseBody
    public List<Room> getRoomList(){
        return iRoomService.selectAllRoom();
    }

    @RequestMapping(value = "addRoom",method = RequestMethod.POST)
    public String addRoom(@RequestParam String roomid,@RequestParam String roomsize,@RequestParam String roomuse,@RequestParam String roomequipment,@RequestParam String roomposition,@RequestParam String note){
        return iRoomService.addRoom(roomid,roomsize,roomuse,roomequipment,roomposition,note);
    }

    @RequestMapping(value = "updateRoom",method = RequestMethod.POST)
    public String updateRoom(@RequestParam String roomid,@RequestParam String roomsize,@RequestParam String roomuse,@RequestParam String roomequipment,@RequestParam String roomposition,@RequestParam String note){
        return iRoomService.updateRoom(roomid,roomsize,roomuse,roomequipment,roomposition,note);
    }

    @RequestMapping(value = "deleteRoom",method = RequestMethod.POST)
    public String deleteRoom(@RequestParam String roomid){
        return iRoomService.deleteRoom(roomid);
    }


}
