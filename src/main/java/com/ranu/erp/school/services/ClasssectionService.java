package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Classsection;

public interface ClasssectionService {
    public Classsection insertClasssection(Classsection pm);
    public Integer updateClasssection(int secid, Classsection pm);

    public Integer deleteClasssection(int secid);

    public String viewClasssection();

    public Classsection viewOneClasssection(int secid);
}
