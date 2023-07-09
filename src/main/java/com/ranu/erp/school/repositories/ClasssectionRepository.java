package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Classsection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasssectionRepository extends JpaRepository<Classsection,Integer> {
}
