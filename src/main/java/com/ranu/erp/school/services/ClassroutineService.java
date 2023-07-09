package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Classroutine;

public interface ClassroutineService {
    public String insertClassroutin(Classroutine cr);

    public String updateClassroutin(int routinid, Classroutine cr);

    public String deleteClassroutin(int routinid);

    public String viewClassroutin();

    public Classroutine viewOneClassroutin(int routinid);

}
