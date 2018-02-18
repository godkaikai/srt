package com.srt.entity;

public class StudyRoom {
    private String roomid;

    private String roomsize;

    public StudyRoom(String roomid, String roomsize) {
        this.roomid = roomid;
        this.roomsize = roomsize;
    }

    public StudyRoom() {
        super();
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public String getRoomsize() {
        return roomsize;
    }

    public void setRoomsize(String roomsize) {
        this.roomsize = roomsize == null ? null : roomsize.trim();
    }
}