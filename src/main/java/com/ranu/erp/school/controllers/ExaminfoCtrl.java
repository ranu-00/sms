package com.ranu.erp.school.controllers;

import com.ranu.erp.school.entities.Examinfo;
import com.ranu.erp.school.services.ExaminfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ExaminfoCtrl {
    @Autowired
    ExaminfoService sub;
    @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        binder.registerCustomEditor(Date.class, "examdate", new CustomDateEditor(format, false));

    }


    @RequestMapping("/showingexaminfopage")
    public ModelAndView showsubjectpage() {
        String subgsonlist = sub.viewExaminfo();
        ModelAndView mv = new ModelAndView("admin/examinfo", "addExaminfoObject1", new Examinfo());
        mv.addObject("examinfomodelobject", subgsonlist);
        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/addingexaminfo", params = "addexaminfo")
    public String addsubject(@ModelAttribute("addExaminfoObject1") Examinfo s) {
        //String categorygsonlist = cdao.viewCategory();
        //ModelAndView mv =new ModelAndView("AddCategory");
        sub.insertExaminfo(s);
        //mv.addObject("categorymodelobject", categorygsonlist);
        return "redirect:/showingexaminfopage";
    }

    @RequestMapping(value = "/addingexaminfo", params = "Editexaminfo")
    public String editsubject(@ModelAttribute("addExaminfoObject1") Examinfo s) {

        //ModelAndView mv =new ModelAndView("AddCategory");
        sub.updateExaminfo(s);
        return "redirect:/showingexaminfopage";
    }

    @RequestMapping("removeexaminfo/{Id}")
    public String removesubject(@PathVariable("Id") int examid) {
        sub.deleteExaminfo(examid);
        return "redirect:/showingexaminfopage";
    }

    @RequestMapping("/editexaminfobutton")
    public ModelAndView passingonesubject(@RequestParam("getExamid") int examid) {

        Examinfo onesub = sub.viewOneExaminfo(examid);
        String subgsonlist = sub.viewExaminfo();
        ModelAndView mv = new ModelAndView("admin/examinfo", "addExaminfoObject1", onesub);
        mv.addObject("examinfomodelobject", subgsonlist);
        mv.addObject("check", "false");
        return mv;
    }
}
