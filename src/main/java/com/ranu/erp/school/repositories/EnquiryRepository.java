package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.EnquiryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryRepository extends JpaRepository<EnquiryModel,Long> {
}
