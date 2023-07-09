package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Menus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenusRepository extends JpaRepository<Menus,Integer> {
}
