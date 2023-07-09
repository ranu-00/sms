package com.ranu.erp.school.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Studentregistration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int regid;
    @Column
    private int stid;
    @Column
    private int yearid;
    @Column
    private int secid;
    @Column
    private int groupid;
    @Column
    private int classid;
    @Temporal(TemporalType.DATE)
    private Date regdate;
    @Column
    private String stroll;

    public int getRegid() {
        return regid;
    }

    public void setRegid(int regid) {
        this.regid = regid;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public int getYearid() {
        return yearid;
    }

    public void setYearid(int yearid) {
        this.yearid = yearid;
    }

    public int getSecid() {
        return secid;
    }

    public void setSecid(int secid) {
        this.secid = secid;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getStroll() {
        return stroll;
    }

    public void setStroll(String stroll) {
        this.stroll = stroll;
    }



}
