package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Classteacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassteacherRepository extends JpaRepository<Classteacher, Integer> {
}
