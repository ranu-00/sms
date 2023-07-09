package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Studentinfo;

public interface StudentinfoService {

    public Studentinfo insertstudent(Studentinfo st);

    public String updatestudent(int stuid, Studentinfo st);

    public String deletestudent(int stuid);

    public String viewstudent();

    public Studentinfo viewSt(String s);

    public Studentinfo viewOnestudent(int stuid);

    public Studentinfo viewstudentprofile(int stuid);

    public Studentinfo showOneStudentbyEmail(String email);

}
