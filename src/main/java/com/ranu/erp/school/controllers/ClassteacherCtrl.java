package com.ranu.erp.school.controllers;

import com.ranu.erp.school.entities.Classteacher;
import com.ranu.erp.school.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ClassteacherCtrl {
    @Autowired
    ClassteacherService classteacher;

    @Autowired
    TeacherinfoService teacherinfo;

    @Autowired
    StgroupService Stgroup;

    @Autowired
    ClassnameService classser;

    @Autowired
    ClasssectionService classsec;

    @Autowired
    AcademicyearService yearser;

    @RequestMapping("/showclassteacherpage")
    public ModelAndView showCteacherpage() {
        String ctlist = classteacher.viewClassteacher();
        String teacherlist = teacherinfo.viewTeacher();
        String grouplist = Stgroup.viewStgroup();
        String classlist = classser.viewClassname();
        String sectionlist = classsec.viewClasssection();
        String yearslist = yearser.viewAcademicyear();
        ModelAndView mv = new ModelAndView("admin/classteacher", "classteacherObject", new Classteacher());
        mv.addObject("classteacherlists", ctlist);
        mv.addObject("teacherlist", teacherlist);
        mv.addObject("grouplists", grouplist);
        mv.addObject("classlists", classlist);
        mv.addObject("sectionlists", sectionlist);
        mv.addObject("yearslists", yearslist);
        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/classteacheradd", params = "Add")
    public String addcteacherpage(@ModelAttribute("classteacherObject") Classteacher ct, HttpServletRequest request) {
        classteacher.insertClassteacher(ct);
        return "redirect:/showclassteacherpage";
    }

    @RequestMapping(value = "/classteacheradd", params = "Edit")
    public String editcteacher(@ModelAttribute("classteacherObject") Classteacher ct, HttpServletRequest request) {
        classteacher.updateClassteacher(ct.getAssignid(), ct);
        return "redirect:/showclassteacherpage";
    }

    @RequestMapping("removingclassteacher/{ctid}")
    public String removecteacher(@PathVariable("ctid") int ctid) {
        classteacher.deleteClassteachert(ctid);
        return "redirect:/showclassteacherpage";
    }

    @RequestMapping("/editingclassteacher")
    public ModelAndView editcteacherpage(@RequestParam("getctid") int ctid) {
        String ctlist = classteacher.viewClassteacher();
        String teacherlist = teacherinfo.viewTeacher();
        String grouplist = Stgroup.viewStgroup();
        String classlist = classser.viewClassname();
        String sectionlist = classsec.viewClasssection();
        String yearslist = yearser.viewAcademicyear();
        ModelAndView mv = new ModelAndView("admin/classteacher", "classteacherObject", classteacher.viewOneClassteacher(ctid));
        mv.addObject("classteacherlists", ctlist);
        mv.addObject("teacherlist", teacherlist);
        mv.addObject("grouplists", grouplist);
        mv.addObject("classlists", classlist);
        mv.addObject("sectionlists", sectionlist);
        mv.addObject("yearslists", yearslist);
        mv.addObject("check", "false");
        return mv;
    }

}
