package com.srt.entity;

public class Log {
    private String id;

    private String adminid;

    private String state;

    private String note;

    private String time;

    public Log(String id, String adminid, String state, String note, String time) {
        this.id = id;
        this.adminid = adminid;
        this.state = state;
        this.note = note;
        this.time = time;
    }

    public Log() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}