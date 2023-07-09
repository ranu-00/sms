package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Guardian;

public interface GuardianService {
    public String insertGuardian(Guardian guar);

    public String updateGuardian(int profileid, Guardian sub);

    public Integer deleteGuardian(int id);

    public String viewGuardian();

    public Guardian viewOneGuardian(int id);
}
