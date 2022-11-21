package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.EnquiryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryRepository extends JpaRepository<EnquiryModel,Long> {
   // @Query(value = "select * from EnquiryModel where email=:",nativeQuery = true)
    public EnquiryModel findByEmail(String email);
}
