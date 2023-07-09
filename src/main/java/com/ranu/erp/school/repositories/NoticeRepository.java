package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends JpaRepository<Notice,Integer> {
}
