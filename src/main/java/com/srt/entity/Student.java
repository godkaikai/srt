package com.srt.entity;

import java.util.Date;

public class Student {
    private Integer studentid;

    private String name;

    private String state;

    private String sex;

    private String idcard;

    private String college;

    private String major;

    private String classnum;

    private String phone;

    private String email;

    private String password;

    private Date creattime;

    private Date updatetime;

    private Date logintime;

    private String note;

    public Student(Integer studentid, String name, String state, String sex, String idcard, String college, String major, String classnum, String phone, String email, String password, Date creattime, Date updatetime, Date logintime, String note) {
        this.studentid = studentid;
        this.name = name;
        this.state = state;
        this.sex = sex;
        this.idcard = idcard;
        this.college = college;
        this.major = major;
        this.classnum = classnum;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.creattime = creattime;
        this.updatetime = updatetime;
        this.logintime = logintime;
        this.note = note;
    }

    public Student() {
        super();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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