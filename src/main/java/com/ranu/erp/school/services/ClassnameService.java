package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Classname;

public interface ClassnameService {
    public Classname insertClassname(Classname sub);

    public Classname updateClassname(Classname sub);

    public Integer deleteClassname(int id);

    public String viewClassname();

    public Classname viewOneClassname(int id);
}
