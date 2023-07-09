package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Classsection;
import com.ranu.erp.school.repositories.ClasssectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasssectionServiceImpl implements ClasssectionService{
    @Autowired
    private ClasssectionRepository classsectionRepository;

    @Override
    public Classsection insertClasssection(Classsection pm) {
        return classsectionRepository.save(pm);
    }

    @Override
    public Integer updateClasssection(int secid, Classsection pm) {
        Classsection Classsectionobject = classsectionRepository.findById(secid).get();
        Classsectionobject.setClassid(pm.getClassid());
        Classsectionobject.setSecname(pm.getSecname());
        Classsectionobject.setSecstatus(pm.getSecstatus());
        classsectionRepository.save(Classsectionobject);
        return null;
    }

    @Override
    public Integer deleteClasssection(int secid) {
        classsectionRepository.delete(classsectionRepository.findById(secid).get());
        return null;
    }

    @Override
    public String viewClasssection() {
        List<Classsection> productslist = classsectionRepository.findAll();
        Gson g = new Gson();
        String productslistgson = g.toJson(productslist);
        return productslistgson;
    }

    @Override
    public Classsection viewOneClasssection(int secid) {
        return classsectionRepository.findById(secid).get();
    }
}
