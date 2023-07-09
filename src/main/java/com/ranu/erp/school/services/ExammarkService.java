package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Exammark;

public interface ExammarkService {
    public String insertExammark(Exammark em);

    public String updateExammark(Exammark em);

    public String deleteExammark(int markid);

    public String viewExammark();

    public Exammark viewOneExammark(int markid);
}
