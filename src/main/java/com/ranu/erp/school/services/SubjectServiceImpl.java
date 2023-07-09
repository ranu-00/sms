package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Subjects;
import com.ranu.erp.school.repositories.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{
    @Autowired
    private SubjectsRepository subjectsRepository;
    @Override
    public Subjects insertSubject(Subjects sub) {
        return subjectsRepository.save(sub);
    }

    @Override
    public String updateSubject(Subjects sub) {
        return null;
    }

    @Override
    public Integer deleteSubject(int id) {
        subjectsRepository.delete(subjectsRepository.findById(id).get());
        return null;
    }

    @Override
    public String viewSubject() {
        List<Subjects> sublist = subjectsRepository.findAll();
        Gson g = new Gson();
        String sublistgson = g.toJson(sublist);
        return sublistgson;
    }

    @Override
    public Subjects viewOneSubject(int id) {
        return subjectsRepository.findById(id).get();
    }
}
