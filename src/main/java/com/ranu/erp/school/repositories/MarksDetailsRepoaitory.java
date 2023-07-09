package com.ranu.erp.school.repositories;

import com.ranu.erp.school.entities.MarksDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarksDetailsRepoaitory extends JpaRepository<MarksDetails,Integer> {
    @Query("select m from MarksDetails m where m.markid=:id")
    public List<MarksDetails> findByMarkId(int id);
}
