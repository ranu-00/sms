/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ranu.erp.school.services;



import com.ranu.erp.school.entities.Role;
import com.ranu.erp.school.entities.User;
import com.ranu.erp.school.repositories.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author HP
 */
@Repository
public class UserServiceImpl implements Userservice{

    
     @Autowired
    SessionFactory sessionFactory;
     
    @Override
    public String acceptUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;
    @Override
    public String insertUser(User u) {
        String status;
        try {
            userRepository.save(new User(u.getEmail(), bCryptPasswordEncoder.encode(u.getPassword()),u.getName(),u.getLastName(),u.getUserPhone(),1,u.getRole()));
            status = "Success";
            //logger.info("End of insert user method in userservice impl");
        } catch (Exception e) {
            //logger.info("inside catch accept user method in userservice impl");
            e.printStackTrace();
            status = "Fail";
        }
        return status;
    }

    @Override
    public String updateUser(User u) {
        return null;
    }

    @Override
    public String deleteUser(User u) {
         return null;
    }

    @Override
    public String viewUsers(User u) {
         return null;
    }

    @Override
    public User viewUser(String email) {

        return userRepository.findByEmail(email);
    }
   
    
    
}
