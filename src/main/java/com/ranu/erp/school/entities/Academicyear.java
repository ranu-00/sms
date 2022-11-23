package com.ranu.erp.school.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Academicyear implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int yearid;
    @Column
    private String accyear;
    @Column
    private String status;

    public int getYearid() {
        return yearid;
    }

    public void setYearid(int yearid) {
        this.yearid = yearid;
    }

    public String getAccyear() {
        return accyear;
    }

    public void setAccyear(String accyear) {
        this.accyear = accyear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
