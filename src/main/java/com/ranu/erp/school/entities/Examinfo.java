package com.ranu.erp.school.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Examinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int examid;
    @Temporal(TemporalType.DATE)
    private Date examdate;
    @Column
    private String examtitle;
    @Column
    private String examdesc;

    public int getExamid() {
        return examid;
    }

    public void setExamid(int examid) {
        this.examid = examid;
    }

    public Date getExamdate() {
        return examdate;
    }

    public void setExamdate(Date examdate) {
        this.examdate = examdate;
    }

    public String getExamtitle() {
        return examtitle;
    }

    public void setExamtitle(String examtitle) {
        this.examtitle = examtitle;
    }

    public String getExamdesc() {
        return examdesc;
    }

    public void setExamdesc(String examdesc) {
        this.examdesc = examdesc;
    }

}
