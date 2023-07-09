package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Studentregistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentregistrationRepo extends JpaRepository<Studentregistration,Integer> {
@Query("SELECT s from Studentregistration s WHERE s.yearid =:accyear AND s.classid =:classi AND s.secid =:section")
public List<Studentregistration> searchStudent(int accyear, int classi, int section);
}
