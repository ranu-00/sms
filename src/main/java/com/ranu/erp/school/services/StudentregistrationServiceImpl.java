package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Studentregistration;
import com.ranu.erp.school.repositories.StudentregistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentregistrationServiceImpl implements StudentregistrationService{
    @Autowired
    private StudentregistrationRepo studentregistrationRepo;
    @Override
    public Studentregistration insertStudentregistration(Studentregistration registration) {
        return studentregistrationRepo.save(registration);
    }

    @Override
    public String updateStudentregistration(int reg_id, Studentregistration registration) {
        Studentregistration onestregobject = studentregistrationRepo.findById(reg_id).get();
        onestregobject.setRegid(registration.getRegid());
        onestregobject.setStid(registration.getStid());
        onestregobject.setGroupid(registration.getGroupid());
        onestregobject.setSecid(registration.getSecid());
        onestregobject.setClassid(registration.getClassid());
        onestregobject.setYearid(registration.getYearid());
        onestregobject.setRegdate(registration.getRegdate());
        onestregobject.setStroll(registration.getStroll());
        studentregistrationRepo.save(onestregobject);
        return null;
    }

    @Override
    public String deleteStudentregistrationr(int reg_id) {
        Studentregistration onestregobject = studentregistrationRepo.findById(reg_id).get();
        studentregistrationRepo.delete(onestregobject);
        return null;
    }

    @Override
    public String viewStudentregistration() {
        List<Studentregistration> reglist = studentregistrationRepo.findAll();
        Gson g = new Gson();
        String reglistgson = g.toJson(reglist);
        return reglistgson;
    }

    @Override
    public Studentregistration viewOneStudentregistration(int reg_id) {
        return studentregistrationRepo.findById(reg_id).get();
    }

    @Override
    public Studentregistration viewOneStudentregid(int reg_id) {
        return null;
    }

    @Override
    public String viewSearchStudent(int a, int b, int c) {
        List<Studentregistration> studentlist = studentregistrationRepo.searchStudent(a,b,c);
        Gson g = new Gson();
        String studentlistgson = g.toJson(studentlist);
        return studentlistgson;
    }
}
