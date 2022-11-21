package com.ranu.erp.school.controllers;

import com.ranu.erp.school.entities.Role;
import com.ranu.erp.school.entities.User;
import com.ranu.erp.school.repositories.RoleRepository;
import com.ranu.erp.school.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @RequestMapping(value = "/")
    public String helloMessage(ModelMap map) {
        map.addAttribute("hello", "Welcome to spring");
        map.addAttribute("name","Md. Rakib Hassan");
      //  userRepository.save(new User("sunil@gmail.com", bCryptPasswordEncoder.encode("password"),"sunil","rana",1));
      //  roleRepository.save(new Role("ROLE_TEACHER"));
        return "index";
    }
}
