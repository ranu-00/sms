package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Examinfo;
import com.ranu.erp.school.repositories.ExaminfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExaminfoServiceImpl implements ExaminfoService{
    @Autowired
    private ExaminfoRepository examinfoRepository;
    @Override
    public String insertExaminfo(Examinfo sub) {
        examinfoRepository.save(sub);
        return null;
    }

    @Override
    public String updateExaminfo(Examinfo sub) {
       // Examinfo sub1 = examinfoRepository.findById()
        return null;
    }

    @Override
    public Integer deleteExaminfo(int id) {
        examinfoRepository.delete(examinfoRepository.findById(id).get());
        return null;
    }

    @Override
    public String viewExaminfo() {
        List<Examinfo> sublist = examinfoRepository.findAll();
        Gson g = new Gson();
        String sublistgson = g.toJson(sublist);
        return sublistgson;
    }

    @Override
    public Examinfo viewOneExaminfo(int id) {
        return examinfoRepository.findById(id).get();
    }

    @Override
    public Examinfo viewOneExamtitle(String extitle) {

        return examinfoRepository.findExamtitleByTitle(extitle);
    }
}
