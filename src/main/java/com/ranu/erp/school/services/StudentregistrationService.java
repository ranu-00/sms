package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Studentregistration;

public interface StudentregistrationService {
    public Studentregistration insertStudentregistration(Studentregistration registration);

    public String updateStudentregistration(int reg_id, Studentregistration registration);

    public String deleteStudentregistrationr(int reg_id);

    public String viewStudentregistration();

    public Studentregistration viewOneStudentregistration(int reg_id);
    public Studentregistration viewOneStudentregid(int reg_id);


    public String viewSearchStudent(int a,int b,int c);
}
