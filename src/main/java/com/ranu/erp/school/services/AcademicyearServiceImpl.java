package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Academicyear;
import com.ranu.erp.school.repositories.AcademicyearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcademicyearServiceImpl implements AcademicyearService{
    @Autowired
    AcademicyearRepository academicyearRepository;
    @Override
    public Academicyear insertAcademicyear(Academicyear sub) {
        sub.setStatus("ACTIVE");
        return academicyearRepository.save(sub);
    }
    @Override
    public Academicyear updateAcademicyear(Academicyear sub1) {
        Academicyear sub =academicyearRepository.findById(sub1.getYearid()).get();
        sub.setAccyear(sub1.getAccyear());
        sub.setStatus(sub1.getStatus());
        return academicyearRepository.save(sub);
    }
    @Override
    public Integer deleteAcademicyear(int id) {
        Optional<Academicyear> academicyear = academicyearRepository.findById(id);
        academicyearRepository.delete(academicyear.get());
        return 1;
    }

    @Override
    public String viewAcademicyear() {
        List<Academicyear> sublist = academicyearRepository.findAll();
        Gson g = new Gson();
        String sublistgson = g.toJson(sublist);
        return sublistgson;
    }

    @Override
    public Academicyear viewOneAcademicyear(int id) {
        return academicyearRepository.findById(id).get();
    }

    @Override
    public Academicyear viewOneyearbyaccyear(String acyear) {
        return academicyearRepository.findAcademicyearByaccyear(acyear);
    }
}
