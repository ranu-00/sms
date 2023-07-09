package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Exammark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExammarkRepository extends JpaRepository<Exammark,Integer> {

}
