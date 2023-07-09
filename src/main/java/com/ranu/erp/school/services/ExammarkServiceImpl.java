package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Exammark;
import com.ranu.erp.school.repositories.ExammarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExammarkServiceImpl implements ExammarkService{
    @Autowired
    private ExammarkRepository exammarkRepository;
    @Override
    public String insertExammark(Exammark em) {
        exammarkRepository.save(em);
        return null;
    }

    @Override
    public String updateExammark(Exammark em) {
        Exammark markobject = new Exammark();
        markobject.setMarkid(em.getMarkid());
        markobject.setClassid(em.getClassid());
        markobject.setGroupid(em.getGroupid());
        markobject.setSecid(em.getSecid());
        markobject.setStid(em.getStid());
        markobject.setYearid(em.getYearid());
        markobject.setExamid(em.getExamid());
        exammarkRepository.save(markobject);
        return null;
    }

    @Override
    public String deleteExammark(int markid) {
        exammarkRepository.deleteById(markid);
        return null;
    }

    @Override
    public String viewExammark() {
        List<Exammark> marklist = exammarkRepository.findAll();
        Gson g = new Gson();
        String ctlistgson = g.toJson(marklist);
        return ctlistgson;
    }

    @Override
    public Exammark viewOneExammark(int markid) {
        return exammarkRepository.findById(markid).get();
    }
}
