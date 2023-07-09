package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Stgroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StgroupRepository extends JpaRepository<Stgroup,Integer> {
}
