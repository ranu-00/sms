package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Studentattendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentattendanceRepository extends JpaRepository<Studentattendance,Integer> {
}
