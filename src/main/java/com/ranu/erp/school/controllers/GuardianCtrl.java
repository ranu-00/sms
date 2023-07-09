package com.ranu.erp.school.controllers;

import com.ranu.erp.school.entities.Guardian;
import com.ranu.erp.school.services.GuardianService;
import com.ranu.erp.school.services.StudentinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuardianCtrl {
    @Autowired
    GuardianService gs;
    @Autowired
    StudentinfoService ss;

    @RequestMapping("/showguardianpage")
    public ModelAndView showguardianpage() {
        String guardian = gs.viewGuardian();
        String student = ss.viewstudent();
        ModelAndView mv = new ModelAndView("admin/guardian", "addGuardianObject", new Guardian());
        mv.addObject("guardianList",guardian);
        mv.addObject("studentList",student);
        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/addingguardian", params = "Add")
    public String addGuardian(@ModelAttribute("addGuardianObject") Guardian s) {
        gs.insertGuardian(s);
        return "redirect:/showguardianpage";
    }

    @RequestMapping(value = "/addingguardian", params = "Edit")
    public String editGuardian(@ModelAttribute("addGuardianObject") Guardian s) {
        gs.updateGuardian(s.getProfileid(), s);
        return "redirect:/showguardianpage";
    }

    @RequestMapping("removeguardian/{Id}")
    public String removeGuardian(@PathVariable("Id") int profileid) {
        gs.deleteGuardian(profileid);
        return "redirect:/showguardianpage";
    }

    @RequestMapping("/editguardianbutton")
    public ModelAndView passingonesubject(@RequestParam("getProfileid") int profileid) {
        String guardian = gs.viewGuardian();
        String student = ss.viewstudent();
        ModelAndView mv = new ModelAndView("admin/guardian", "addGuardianObject", gs.viewOneGuardian(profileid));
        mv.addObject("guardianList",guardian);
        mv.addObject("studentList",student);
        mv.addObject("check", "false");
        return mv;
    }
}
