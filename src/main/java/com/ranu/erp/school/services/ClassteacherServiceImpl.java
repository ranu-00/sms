package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Classteacher;
import com.ranu.erp.school.repositories.ClassteacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassteacherServiceImpl implements ClassteacherService{

    @Autowired
    private ClassteacherRepository classteacherRepository;
    @Override
    public String insertClassteacher(Classteacher ct) {
        classteacherRepository.save(ct);
        return null;
    }

    @Override
    public String updateClassteacher(int cteacherid, Classteacher ct) {
        Classteacher onectobject = classteacherRepository.findById(cteacherid).get();
        onectobject.setAssignid(ct.getAssignid());
        onectobject.setClassid(ct.getClassid());
        onectobject.setGroupid(ct.getGroupid());
        onectobject.setSecid(ct.getSecid());
        onectobject.setTid(ct.getTid());
        onectobject.setYearid(ct.getYearid());
        classteacherRepository.save(onectobject);
        return null;
    }

    @Override
    public String deleteClassteachert(int cteacherid) {
        Classteacher onectobject = classteacherRepository.findById(cteacherid).get();
        classteacherRepository.delete(onectobject);
        return null;
    }

    @Override
    public String viewClassteacher() {
        List<Classteacher> ctlist = classteacherRepository.findAll();
        Gson g = new Gson();
        String ctlistgson = g.toJson(ctlist);
        return ctlistgson;
    }

    @Override
    public Classteacher viewOneClassteacher(int cteacherid) {
        return classteacherRepository.findById(cteacherid).get();
    }
}
