package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Classsection;
import com.ranu.erp.school.entities.MarksDetails;
import com.ranu.erp.school.repositories.MarksDetailsRepoaitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MarksDetailsServiceImpl implements MarksDetailsService{
    @Autowired
    MarksDetailsRepoaitory marksDetailsRepoaitory;
    @Override
    public String insertStudentmarks(ArrayList<MarksDetails> markdetail) {
        for (MarksDetails pdetails : markdetail) {
            marksDetailsRepoaitory.save(pdetails);
        }
        return null;
    }

    @Override
    public String insertStudentmarks(MarksDetails marks) {
        marksDetailsRepoaitory.save(marks);
        return null;
    }

    @Override
    public String updateStudentmarks(int prid, MarksDetails pm) {
        MarksDetails md = marksDetailsRepoaitory.findById(prid).get();
        md.setMarkid(pm.getMarkid());
        md.setSubjectid(pm.getSubjectid());
        md.setMarkobtain(pm.getMarkobtain());
        md.setMarkgrade(pm.getMarkgrade());
        marksDetailsRepoaitory.save(md);
        return null;
    }

    @Override
    public String deleteStudentmarks(int id) {
        marksDetailsRepoaitory.deleteById(id);
        return null;
    }

    @Override
    public String showStudentmarks() {
        List<MarksDetails> productslist = marksDetailsRepoaitory.findAll();
        Gson g = new Gson();
        String productslistgson = g.toJson(productslist);
        return productslistgson;
    }

    @Override
    public MarksDetails showOneStudentmarks(int id) {
        return marksDetailsRepoaitory.findById(id).get();
    }

    @Override
    public String showStudentmarks(int id) {
        List<MarksDetails> productslist =marksDetailsRepoaitory.findByMarkId(id);
        Gson g = new Gson();
        String productslistgson = g.toJson(productslist);
        return productslistgson;
    }
}
