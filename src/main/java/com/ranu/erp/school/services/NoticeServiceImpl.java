package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Notice;
import com.ranu.erp.school.repositories.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{
    @Autowired
    NoticeRepository noticeRepository;
    @Override
    public String insertNotice(Notice sub) {
        noticeRepository.save(sub);
        return null;
    }

    @Override
    public String updateNotice(Notice sub) {
       // Notice cm = (CategoriesModel)s.get(CategoriesModel.class, categoryid);
        return null;
    }

    @Override
    public Integer deleteNotice(int id) {
        noticeRepository.deleteById(id);
        return null;
    }

    @Override
    public String viewNotice() {
        List<Notice> sublist = noticeRepository.findAll();
        Gson g = new Gson();
        String sublistgson = g.toJson(sublist);
        return sublistgson;
    }

    @Override
    public Notice viewOneNotice(int id) {
        return noticeRepository.findById(id).get();
    }
}
