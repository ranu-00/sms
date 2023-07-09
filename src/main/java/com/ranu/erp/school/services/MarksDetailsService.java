package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.MarksDetails;

import java.util.ArrayList;

public interface MarksDetailsService {
    public String insertStudentmarks(ArrayList<MarksDetails> markdetail);

    public String insertStudentmarks(MarksDetails marks);

    public String updateStudentmarks(int prid, MarksDetails marks);

    public String deleteStudentmarks(int id);

    public String showStudentmarks();

    public MarksDetails showOneStudentmarks(int id);

    public String showStudentmarks(int id);
}
