package com.srt.entity;

public class teacher {
    private String teacherid;

    private String teachername;

    private String teachersex;

    private String teachercollege;

    private String teacherteach;

    private String teacherposition;

    private String teacherphone;

    private String password;

    public teacher(String teacherid, String teachername, String teachersex, String teachercollege, String teacherteach, String teacherposition, String teacherphone, String password) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.teachersex = teachersex;
        this.teachercollege = teachercollege;
        this.teacherteach = teacherteach;
        this.teacherposition = teacherposition;
        this.teacherphone = teacherphone;
        this.password = password;
    }

    public teacher() {
        super();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeachersex() {
        return teachersex;
    }

    public void setTeachersex(String teachersex) {
        this.teachersex = teachersex == null ? null : teachersex.trim();
    }

    public String getTeachercollege() {
        return teachercollege;
    }

    public void setTeachercollege(String teachercollege) {
        this.teachercollege = teachercollege == null ? null : teachercollege.trim();
    }

    public String getTeacherteach() {
        return teacherteach;
    }

    public void setTeacherteach(String teacherteach) {
        this.teacherteach = teacherteach == null ? null : teacherteach.trim();
    }

    public String getTeacherposition() {
        return teacherposition;
    }

    public void setTeacherposition(String teacherposition) {
        this.teacherposition = teacherposition == null ? null : teacherposition.trim();
    }

    public String getTeacherphone() {
        return teacherphone;
    }

    public void setTeacherphone(String teacherphone) {
        this.teacherphone = teacherphone == null ? null : teacherphone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}