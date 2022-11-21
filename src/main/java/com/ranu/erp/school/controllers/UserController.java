/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ranu.erp.school.controllers;



import com.ranu.erp.school.entities.Role;
import com.ranu.erp.school.entities.User;
import com.ranu.erp.school.entities.UserModel;
import com.ranu.erp.school.services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.Set;

@Controller
public class UserController {
    @Autowired
    Userservice us;
            
    
    @RequestMapping("/signup")
    public ModelAndView signUpPage() {
        ModelAndView mv = new ModelAndView("signup");
        mv.addObject("urm", new User());
        return mv;
    }
    
    @RequestMapping(value= "/reguser", method = RequestMethod.POST)
    public ModelAndView reguser(@ModelAttribute("urm") UserModel urm) {
        Set<Role> roles = new HashSet<Role>();
        roles.add(new Role(urm.getRoles()));
        User urm1 = new User(urm.getEmail(),urm.getPassword(),urm.getName(),urm.getLastName(),urm.getUserPhone(), 1,roles);
        String result = us.insertUser(urm1);

        if (result.equalsIgnoreCase("success")) {
            ModelAndView mv = new ModelAndView("login");
            mv.addObject(result, "success");
            return mv;
        } else {
            ModelAndView mv = new ModelAndView("signup");
            mv.addObject(result, "fail");
            return mv;
        }
    }
}
