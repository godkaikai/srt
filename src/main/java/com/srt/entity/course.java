package com.srt.entity;

public class course {
    private String courseid;

    private String coursename;

    private String courseroom;

    private Integer beginandend;

    private Integer courseweekday;

    private Integer coursesection;

    private Integer courseindex;

    private Integer studentnums;

    private Integer studytime;

    private Float credits;

    private Integer rundection;

    private String teachername;

    private String useclass;

    public course(String courseid, String coursename, String courseroom, Integer beginandend, Integer courseweekday, Integer coursesection, Integer courseindex, Integer studentnums, Integer studytime, Float credits, Integer rundection, String teachername, String useclass) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.courseroom = courseroom;
        this.beginandend = beginandend;
        this.courseweekday = courseweekday;
        this.coursesection = coursesection;
        this.courseindex = courseindex;
        this.studentnums = studentnums;
        this.studytime = studytime;
        this.credits = credits;
        this.rundection = rundection;
        this.teachername = teachername;
        this.useclass = useclass;
    }

    public course() {
        super();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getCourseroom() {
        return courseroom;
    }

    public void setCourseroom(String courseroom) {
        this.courseroom = courseroom == null ? null : courseroom.trim();
    }

    public Integer getBeginandend() {
        return beginandend;
    }

    public void setBeginandend(Integer beginandend) {
        this.beginandend = beginandend;
    }

    public Integer getCourseweekday() {
        return courseweekday;
    }

    public void setCourseweekday(Integer courseweekday) {
        this.courseweekday = courseweekday;
    }

    public Integer getCoursesection() {
        return coursesection;
    }

    public void setCoursesection(Integer coursesection) {
        this.coursesection = coursesection;
    }

    public Integer getCourseindex() {
        return courseindex;
    }

    public void setCourseindex(Integer courseindex) {
        this.courseindex = courseindex;
    }

    public Integer getStudentnums() {
        return studentnums;
    }

    public void setStudentnums(Integer studentnums) {
        this.studentnums = studentnums;
    }

    public Integer getStudytime() {
        return studytime;
    }

    public void setStudytime(Integer studytime) {
        this.studytime = studytime;
    }

    public Float getCredits() {
        return credits;
    }

    public void setCredits(Float credits) {
        this.credits = credits;
    }

    public Integer getRundection() {
        return rundection;
    }

    public void setRundection(Integer rundection) {
        this.rundection = rundection;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getUseclass() {
        return useclass;
    }

    public void setUseclass(String useclass) {
        this.useclass = useclass == null ? null : useclass.trim();
    }
}