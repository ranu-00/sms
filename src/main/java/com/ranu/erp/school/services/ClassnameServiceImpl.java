package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Classname;
import com.ranu.erp.school.repositories.ClassnameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassnameServiceImpl implements ClassnameService{
    @Autowired
    private ClassnameRepository classnameRepository;
    @Override
    public Classname insertClassname(Classname sub) {
        return classnameRepository.save(sub);
    }

    @Override
    public Classname updateClassname(Classname sub1) {
        Classname sub = classnameRepository.findById(sub1.getClassid()).get();
        sub.setClassname(sub1.getClassname());
        sub.setStatus(sub1.getStatus());
        return classnameRepository.save(sub);
    }

    @Override
    public Integer deleteClassname(int id) {
        Optional<Classname> classname = classnameRepository.findById(id);
        classnameRepository.delete(classname.get());
        return 1;
    }

    @Override
    public String viewClassname() {
        List<Classname> sublist = classnameRepository.findAll();
        Gson g = new Gson();
        String sublistgson = g.toJson(sublist);
        return sublistgson;
    }

    @Override
    public Classname viewOneClassname(int id) {
        return classnameRepository.findById(id).get();
    }
}
