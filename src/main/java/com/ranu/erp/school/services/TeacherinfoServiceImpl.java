/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ranu.erp.school.services;



import com.google.gson.Gson;
import com.ranu.erp.school.entities.Role;
import com.ranu.erp.school.entities.Teacherinfo;
import com.ranu.erp.school.entities.User;
import com.ranu.erp.school.repositories.TeacherInfoRepository;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author HP
 */
@Service
public class TeacherinfoServiceImpl implements TeacherinfoService {

    @Autowired
    private TeacherInfoRepository teacherInfoRepository;
    @Autowired
    SessionFactory sessionFactory;

    @Override

    public String insertTeacher(Teacherinfo te) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        User u = new User();
        Role ur = new Role("ROLE_TEACHER");
        u.setEmail(te.getTemail());
        u.setName(te.getTname());
        u.setLastName(te.getTcontact());
        u.setPassword(te.getPassword());

       // ur.setRole(te.getRole());
        //ur.setStatus(te.getStatus());
        //ur.setImage(te.getTimage());

        s.save(te);
        s.save(u);
        s.save(ur);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updateTeacher(int teacher_id, Teacherinfo teacher) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Teacherinfo oneteacherobject = (Teacherinfo) s.get(Teacherinfo.class, teacher_id);
        oneteacherobject.setTid(teacher.getTid());
        oneteacherobject.setSubjectid(teacher.getSubjectid());
        oneteacherobject.setTname(teacher.getTname());
        oneteacherobject.setTaddress(teacher.getTaddress());
        oneteacherobject.setTcontact(teacher.getTcontact());
        oneteacherobject.setTemail(teacher.getTemail());
        oneteacherobject.setTjoindate(teacher.getTjoindate());
        oneteacherobject.setTgender(teacher.getTgender());
        oneteacherobject.setTstatus(teacher.getTstatus());
        s.update(oneteacherobject);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deleteTeacher(int teacher_id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Teacherinfo teacher = (Teacherinfo) s.get(Teacherinfo.class, teacher_id);
        s.delete(teacher);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String viewTeacher() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<Teacherinfo> teacherlist = s.createQuery("from Teacherinfo").list();
        Gson g = new Gson();
        String teacherlistgson = g.toJson(teacherlist);
        t.commit();
        s.close();
        return teacherlistgson;
    }

    @Override
    public Teacherinfo viewOneTeacher(int teacher_id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Teacherinfo teacher = (Teacherinfo) s.get(Teacherinfo.class, teacher_id);
        t.commit();
        s.close();
        return teacher;
    }

    @Override
    public Teacherinfo showOneTeacherbyEmail(String email) {
        Teacherinfo teacher =  teacherInfoRepository.getByTemail(email);
        return teacher;
    }
}
