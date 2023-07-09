package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Examinfo;

public interface ExaminfoService {
    public String insertExaminfo(Examinfo sub);

    public String updateExaminfo(Examinfo sub);

    public Integer deleteExaminfo(int id);

    public String viewExaminfo();

    public Examinfo viewOneExaminfo(int id);

    public Examinfo viewOneExamtitle(String extitle);

}
