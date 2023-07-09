package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Studentattendance;

public interface StudentattendanceService {
    public String inserattendenc(Studentattendance sat);

    public String updateattendenc(int satid, Studentattendance sat);

    public String deleteattendenc(int satid);

    public String viewattendenc();
    public String viewattendencsheet(int clid);

    public Studentattendance viewOneattendenc(int satid);
}
