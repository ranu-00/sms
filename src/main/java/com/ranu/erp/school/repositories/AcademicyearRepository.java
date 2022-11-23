package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Academicyear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicyearRepository extends JpaRepository<Academicyear,Integer> {
    @Query(value = "select * from Academicyear where accyear=?",nativeQuery = true)
    Academicyear findAcademicyearByaccyear(String acyear);
}
