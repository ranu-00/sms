package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Stgroup;
import com.ranu.erp.school.repositories.StgroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StgroupServiceImpl implements StgroupService{
    @Autowired
    private StgroupRepository stgroupRepository;
    @Override
    public Stgroup insertStgroup(Stgroup sub) {
        return stgroupRepository.save(sub);
    }

    @Override
    public String updateStgroup(Stgroup sub) {
        return null;
    }

    @Override
    public Integer deleteStgroup(int id) {
        stgroupRepository.delete(stgroupRepository.findById(id).get());
        return null;
    }

    @Override
    public String viewStgroup() {
        List<Stgroup> sublist = stgroupRepository.findAll();
        Gson g = new Gson();
        String sublistgson = g.toJson(sublist);
        return sublistgson;
    }

    @Override
    public Stgroup viewOneStgroup(int id) {
        return stgroupRepository.findById(id).get();
    }
}
