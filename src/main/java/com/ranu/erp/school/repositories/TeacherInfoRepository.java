package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Teacherinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherInfoRepository extends JpaRepository<Teacherinfo,Integer> {
 Teacherinfo getByTemail(String email);
}
