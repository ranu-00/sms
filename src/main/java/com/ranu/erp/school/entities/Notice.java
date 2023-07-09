package com.ranu.erp.school.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int noticeid;
    @Temporal(TemporalType.DATE)
    private Date noticedate;
    @Column
    private String noticetitle;
    @Column
    private String description;
    @Column
    private String status;

    public int getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(int noticeid) {
        this.noticeid = noticeid;
    }


    public Date getNoticedate() {
        return noticedate;
    }

    public void setNoticedate(Date noticedate) {
        this.noticedate = noticedate;
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
