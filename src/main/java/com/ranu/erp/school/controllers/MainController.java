package com.ranu.erp.school.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class MainController {
    @RequestMapping(value = "/adminpanel")
    public String adminPanel(ModelMap map) {
        Date d = new Date();
        SimpleDateFormat si = new SimpleDateFormat("hh:mm:ss a");
        map.addAttribute("time", si.format(d));
        return "admin";
    }

    @RequestMapping(value = "/teacherpanel")
    public String teacherPanel(ModelMap map) {
        Date d = new Date();
        SimpleDateFormat si = new SimpleDateFormat("hh:mm:ss a");
        map.addAttribute("time", si.format(d));
        return "teacher";
    }

    @RequestMapping(value = "/guardianpanel")
    public String guardianPanel(ModelMap map) {
        Date d = new Date();
        SimpleDateFormat si = new SimpleDateFormat("hh:mm:ss a");
        map.addAttribute("time", si.format(d));
        return "guardian";
    }

    @RequestMapping(value = "/studentpanel")
    public String studentPanel(ModelMap map) {
        Date d = new Date();
        SimpleDateFormat si = new SimpleDateFormat("hh:mm:ss a");
        map.addAttribute("time", si.format(d));
        return "student";
    }

}
