package com.srt.entity;

public class Room {
    private String roomid;

    private String roomsize;

    private String roomuse;

    private String roomequipment;

    private String roomposition;

    private String note;

    public Room(String roomid, String roomsize, String roomuse, String roomequipment, String roomposition, String note) {
        this.roomid = roomid;
        this.roomsize = roomsize;
        this.roomuse = roomuse;
        this.roomequipment = roomequipment;
        this.roomposition = roomposition;
        this.note = note;
    }

    public Room() {
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

    public String getRoomuse() {
        return roomuse;
    }

    public void setRoomuse(String roomuse) {
        this.roomuse = roomuse == null ? null : roomuse.trim();
    }

    public String getRoomequipment() {
        return roomequipment;
    }

    public void setRoomequipment(String roomequipment) {
        this.roomequipment = roomequipment == null ? null : roomequipment.trim();
    }

    public String getRoomposition() {
        return roomposition;
    }

    public void setRoomposition(String roomposition) {
        this.roomposition = roomposition == null ? null : roomposition.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}