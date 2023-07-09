package com.ranu.erp.school.entities;

import javax.persistence.*;

@Entity
public class Stgroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int groupid;
    @Column
    private String groupname;

    @Column
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
}
