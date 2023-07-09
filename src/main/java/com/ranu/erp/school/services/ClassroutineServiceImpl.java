package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Classroutine;
import com.ranu.erp.school.repositories.ClassroutineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroutineServiceImpl implements ClassroutineService{

    @Autowired
    private ClassroutineRepository classroutineRepository;
    @Override
    public String insertClassroutin(Classroutine cr) {
        classroutineRepository.save(cr);
        return null;
    }

    @Override
    public String updateClassroutin(int routinid, Classroutine cr) {
        Classroutine onecrobject = classroutineRepository.findById(routinid).get();
        onecrobject.setRoutineid(cr.getRoutineid());
        onecrobject.setClassid(cr.getClassid());
        onecrobject.setTid(cr.getTid());
        onecrobject.setSecid(cr.getSecid());
        onecrobject.setSubjectid(cr.getSubjectid());
        onecrobject.setPeriodname(cr.getPeriodname());
        onecrobject.setDayname(cr.getDayname());
        onecrobject.setPeriodtime(cr.getPeriodtime());
        classroutineRepository.save(onecrobject);

        return null;
    }

    @Override
    public String deleteClassroutin(int routinid) {
        Classroutine onecrobject = classroutineRepository.findById(routinid).get();
        classroutineRepository.delete(onecrobject);
        return null;
    }

    @Override
    public String viewClassroutin() {
        List<Classroutine> crlist =classroutineRepository.findAll();
        Gson g = new Gson();
        String ctlistgson = g.toJson(crlist);
        return ctlistgson;
    }

    @Override
    public Classroutine viewOneClassroutin(int routinid) {
        return classroutineRepository.findById(routinid).get();
    }
}
