package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Classroutine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroutineRepository extends JpaRepository<Classroutine,Integer> {
}
