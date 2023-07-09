package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Stgroup;

public interface StgroupService {
    public Stgroup insertStgroup(Stgroup sub);

    public String updateStgroup(Stgroup sub);

    public Integer deleteStgroup(int id);

    public String viewStgroup();

    public Stgroup viewOneStgroup(int id);
}
