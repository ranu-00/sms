package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Guardian;
import com.ranu.erp.school.repositories.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuardianServiceImpl implements GuardianService{
    @Autowired
    GuardianRepository guardianRepository;
    @Override
    public String insertGuardian(Guardian guar) {
        guardianRepository.save(guar);
        return null;
    }

    @Override
    public String updateGuardian(int profileid, Guardian em) {
        Guardian gn = guardianRepository.findById(profileid).get();
        gn.setProfileid(em.getProfileid());
        gn.setFname(em.getFname());
        gn.setLname(em.getLname());
        gn.setEmailid(em.getEmailid());
        gn.setOccupation(em.getOccupation());
        gn.setContact(em.getContact());
        gn.setGender(em.getGender());
        gn.setStid(em.getStid());
        gn.setStatus(em.getStatus());
        guardianRepository.save(gn);
        return null;
    }

    @Override
    public Integer deleteGuardian(int id) {
        guardianRepository.deleteById(id);
        return null;
    }

    @Override
    public String viewGuardian() {
        List<Guardian> guardianList = guardianRepository.findAll();
        Gson g = new Gson();
        String ctlistgson = g.toJson(guardianList);
        return ctlistgson;
    }

    @Override
    public Guardian viewOneGuardian(int id) {
        return guardianRepository.findById(id).get();
    }
}
