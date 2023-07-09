package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Studentattendance;
import com.ranu.erp.school.repositories.StudentattendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentattendanceServiceImpl implements StudentattendanceService{

    @Autowired
    private StudentattendanceRepository studentattendanceRepository;
    @Override
    public String inserattendenc(Studentattendance sat) {
        return studentattendanceRepository.save(sat).getAtstatus();
    }

    @Override
    public String updateattendenc(int satid, Studentattendance sat) {
        Studentattendance oneattobject = studentattendanceRepository.findById(satid).get();
        oneattobject.setAtid(sat.getAtid());
        oneattobject.setClassid(sat.getClassid());
        oneattobject.setGroupid(sat.getGroupid());
        oneattobject.setSecid(sat.getSecid());
        oneattobject.setRegid(sat.getRegid());
        oneattobject.setStid(sat.getStid());
        oneattobject.setAtdate(sat.getAtdate());
        oneattobject.setAtstatus(sat.getAtstatus());
        studentattendanceRepository.save(oneattobject);
        return null;
    }

    @Override
    public String deleteattendenc(int satid) {
        Studentattendance oneattobject = studentattendanceRepository.findById(satid).get();
        studentattendanceRepository.delete(oneattobject);
        return null;
    }

    @Override
    public String viewattendenc() {
        List<Studentattendance> attlist = studentattendanceRepository.findAll();
        Gson g = new Gson();
        String stulistgson = g.toJson(attlist);
        return stulistgson;
    }

    @Override
    public String viewattendencsheet(int clid) {
        List<Studentattendance> attlist = studentattendanceRepository.findAllById(Collections.singleton(clid));
        Gson g = new Gson();
        String stulistgson = g.toJson(attlist);
        return stulistgson;
    }

    @Override
    public Studentattendance viewOneattendenc(int satid) {
        return studentattendanceRepository.findById(satid).get();
    }
}
