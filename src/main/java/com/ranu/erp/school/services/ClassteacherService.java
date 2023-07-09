package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Classteacher;

public interface ClassteacherService {
    public String insertClassteacher(Classteacher ct);

    public String updateClassteacher(int cteacherid, Classteacher ct);

    public String deleteClassteachert(int cteacherid);

    public String viewClassteacher();

    public Classteacher viewOneClassteacher(int cteacherid);
}
