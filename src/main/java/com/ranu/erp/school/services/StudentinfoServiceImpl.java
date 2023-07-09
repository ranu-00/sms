package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Studentinfo;
import com.ranu.erp.school.repositories.StudentinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentinfoServiceImpl implements StudentinfoService{

    @Autowired
    private StudentinfoRepository studentinfoRepository;
    @Override
    public Studentinfo insertstudent(Studentinfo st) {
        return studentinfoRepository.save(st);
    }

    @Override
    public String updatestudent(int stuid, Studentinfo st) {
        Studentinfo onestuobject = studentinfoRepository.findById(stuid).get();
        onestuobject.setStid(st.getStid());
        onestuobject.setStname(st.getStname());
        onestuobject.setStfathername(st.getStfathername());
        onestuobject.setStmothername(st.getStmothername());
        onestuobject.setParmanentaddress(st.getParmanentaddress());
        onestuobject.setPresentaddress(st.getPresentaddress());
        onestuobject.setStage(st.getStage());
        onestuobject.setStcontact(st.getStcontact());
        onestuobject.setStdob(st.getStdob());
        onestuobject.setStgender(st.getStgender());
        onestuobject.setStstatus(st.getStstatus());
        onestuobject.setStimage(st.getStimage());
        studentinfoRepository.save(onestuobject);
        return null;
    }

    @Override
    public String deletestudent(int stuid) {
        studentinfoRepository.delete(studentinfoRepository.findById(stuid).get());
        return null;
    }

    @Override
    public String viewstudent() {
        List<Studentinfo> stulist = studentinfoRepository.findAll();
        Gson g = new Gson();
        String stulistgson = g.toJson(stulist);
        return stulistgson;
    }

    @Override
    public Studentinfo viewSt(String s) {
        Studentinfo us =studentinfoRepository.findByName(s);
        return us;
    }

    @Override
    public Studentinfo viewOnestudent(int stuid) {
        Studentinfo student = studentinfoRepository.findById(stuid).get();
        return student;
    }

    @Override
    public Studentinfo viewstudentprofile(int stuid) {
        return studentinfoRepository.findById(stuid).get();
    }

    @Override
    public Studentinfo showOneStudentbyEmail(String email) {
        return studentinfoRepository.findByEmailId(email);
    }
}
