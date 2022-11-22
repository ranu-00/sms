package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Classname;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassnameRepository extends JpaRepository<Classname,Integer> {
}
