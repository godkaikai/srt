package com.srt.entity;

import java.util.Date;

public class reply {
    private String reid;

    private String result;

    private String reason;

    private String code;

    private String id;

    private Date settime;

    public reply(String reid, String result, String reason, String code, String id, Date settime) {
        this.reid = reid;
        this.result = result;
        this.reason = reason;
        this.code = code;
        this.id = id;
        this.settime = settime;
    }

    public reply() {
        super();
    }

    public String getReid() {
        return reid;
    }

    public void setReid(String reid) {
        this.reid = reid == null ? null : reid.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getSettime() {
        return settime;
    }

    public void setSettime(Date settime) {
        this.settime = settime;
    }
}