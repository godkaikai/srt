package com.srt.entity;

import java.util.Date;

public class admin {
    private String adminid;

    private String name;

    private String level;

    private String phone;

    private String password;

    private String state;

    private Date creattime;

    private Date updatetime;

    private Date logintime;

    private String note;

    public admin(String adminid, String name, String level, String phone, String password, String state, Date creattime, Date updatetime, Date logintime, String note) {
        this.adminid = adminid;
        this.name = name;
        this.level = level;
        this.phone = phone;
        this.password = password;
        this.state = state;
        this.creattime = creattime;
        this.updatetime = updatetime;
        this.logintime = logintime;
        this.note = note;
    }

    public admin() {
        super();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}