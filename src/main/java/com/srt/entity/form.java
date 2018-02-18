package com.srt.entity;

import java.util.Date;

public class form {
    private String id;

    private String name;

    private String behalf;

    private String roomsize;

    private String roomequipment;

    private Integer useday;

    private Integer usetime;

    private String reason;

    private String phone;

    private String state;

    private Date settime;

    public form(String id, String name, String behalf, String roomsize, String roomequipment, Integer useday, Integer usetime, String reason, String phone, String state, Date settime) {
        this.id = id;
        this.name = name;
        this.behalf = behalf;
        this.roomsize = roomsize;
        this.roomequipment = roomequipment;
        this.useday = useday;
        this.usetime = usetime;
        this.reason = reason;
        this.phone = phone;
        this.state = state;
        this.settime = settime;
    }

    public form() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBehalf() {
        return behalf;
    }

    public void setBehalf(String behalf) {
        this.behalf = behalf == null ? null : behalf.trim();
    }

    public String getRoomsize() {
        return roomsize;
    }

    public void setRoomsize(String roomsize) {
        this.roomsize = roomsize == null ? null : roomsize.trim();
    }

    public String getRoomequipment() {
        return roomequipment;
    }

    public void setRoomequipment(String roomequipment) {
        this.roomequipment = roomequipment == null ? null : roomequipment.trim();
    }

    public Integer getUseday() {
        return useday;
    }

    public void setUseday(Integer useday) {
        this.useday = useday;
    }

    public Integer getUsetime() {
        return usetime;
    }

    public void setUsetime(Integer usetime) {
        this.usetime = usetime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getSettime() {
        return settime;
    }

    public void setSettime(Date settime) {
        this.settime = settime;
    }
}