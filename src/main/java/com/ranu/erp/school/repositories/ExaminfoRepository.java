package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Examinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminfoRepository extends JpaRepository<Examinfo,Integer> {
    @Query("SELECT s from Examinfo s WHERE s.examtitle =:extitle")
    public Examinfo findExamtitleByTitle(String extitle);
}
