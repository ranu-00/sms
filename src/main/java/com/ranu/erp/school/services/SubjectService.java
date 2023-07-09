package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Subjects;

public interface SubjectService {
    public Subjects insertSubject(Subjects sub);

    public String updateSubject(Subjects sub);

    public Integer deleteSubject(int id);

    public String viewSubject();

    public Subjects viewOneSubject(int id);
}
