package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects,Integer> {
}
