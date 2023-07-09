package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.Studentinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentinfoRepository extends JpaRepository<Studentinfo,Integer> {
    @Query("select s from Studentinfo s where s.stname=:name")
    public Studentinfo findByName(String name);
    @Query("select s from Studentinfo s where s.emailid=:email")
    public Studentinfo findByEmailId(String email);
}
