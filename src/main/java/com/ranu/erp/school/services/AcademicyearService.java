package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Academicyear;

public interface AcademicyearService {
    public Academicyear insertAcademicyear(Academicyear sub);

    public Academicyear updateAcademicyear(Academicyear sub);

    public Integer deleteAcademicyear(int id);

    public String viewAcademicyear();

    public Academicyear viewOneAcademicyear(int id);

    public Academicyear viewOneyearbyaccyear(String acyear);
}
