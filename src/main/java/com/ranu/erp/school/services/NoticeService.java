package com.ranu.erp.school.services;


import com.ranu.erp.school.entities.Notice;

public interface NoticeService {
    public String insertNotice(Notice sub);

    public String updateNotice(Notice sub);

    public Integer deleteNotice(int id);

    public String viewNotice();

    public Notice viewOneNotice(int id);
}
