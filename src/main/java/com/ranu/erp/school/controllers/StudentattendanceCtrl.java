package com.ranu.erp.school.controllers;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Classname;
import com.ranu.erp.school.entities.Studentattendance;
import com.ranu.erp.school.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class StudentattendanceCtrl {
    @Autowired
    StudentattendanceService atten;

    @Autowired
    StudentregistrationService streg;

    @Autowired
    StudentinfoService stinfo;

    @Autowired
    StgroupService stgroup;

    @Autowired
    ClassnameService classser;

    @Autowired
    ClasssectionService classsec;

    @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        //binder.setDisallowedFields(new String[]{"empMobile"});
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        binder.registerCustomEditor(Date.class, "atdate", new CustomDateEditor(format, false));
//        binder.registerCustomEditor(String.class, "ename", new EmployeeNameEditor());
    }

    @RequestMapping("/attendencpage")
    public ModelAndView showteacherpage() {
        String attendencelist = atten.viewattendenc();
        String studentlist = stinfo.viewstudent();
        String streglist = streg.viewStudentregistration();
        String classlist = classser.viewClassname();
        String grouplist = stgroup.viewStgroup();
        String sectiontlist = classsec.viewClasssection();
        ModelAndView mv = new ModelAndView("admin/attendence", "attendenceObject", new Studentattendance());
        mv.addObject("attendencelists", attendencelist);
        mv.addObject("studentlists", studentlist);
        mv.addObject("streglists", streglist);
        mv.addObject("classlists", classlist);
        mv.addObject("grouplists", grouplist);
        mv.addObject("sectiontlists", sectiontlist);
        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/searchattendancsheet")
    public ModelAndView showattendancesheet() {
        String classlist = classser.viewClassname();
        ModelAndView mv = new ModelAndView("attendancesheet", "attendenceObject", new Classname());
        mv.addObject("classlists", classlist);
        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/loadattendancsheet")
    public ModelAndView showloadattendancesheet(Classname cl) {
        int clid = cl.getClassid();
        System.out.println("Class id =" + clid);
        String streglist = streg.viewStudentregistration();
        String stulist = atten.viewattendencsheet(clid);
        System.out.println("studentlist" + stulist);
        ModelAndView mv = new ModelAndView("attendanclist", "attendenceObject", new Studentattendance());
        mv.addObject("streglists", streglist);
        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/addingattendence", params = "Add")
    public String addattendence(@ModelAttribute("attendenceObject") Studentattendance att, HttpServletRequest request) {
        atten.inserattendenc(att);
        return "redirect:/attendencpage";
    }

    @RequestMapping(value = "/addingattendence", params = "Edit")
    public String editattendence(@ModelAttribute("attendenceObject") Studentattendance att, HttpServletRequest request) {
        atten.updateattendenc(att.getAtid(), att);

        return "redirect:/attendencpage";
    }

    @RequestMapping("removingattendence/{attnid}")
    public String removeattendence(@PathVariable("attnid") int atnid) {
        atten.deleteattendenc(atnid);
        return "redirect:/attendencpage";
    }

    @RequestMapping("/viewattendence")
    public ModelAndView viewatten(@RequestParam("getattId") int attnid, HttpSession session) {
        Gson g = new Gson();
        String teacherinfo = g.toJson(atten.viewattendenc());
        //session.setAttribute("productid", productid);
        ModelAndView mv = new ModelAndView("description");
        mv.addObject("oneteacher", teacherinfo);
        return mv;
    }

    @RequestMapping("/attenpage")
    public ModelAndView viewattendencelist() {
        String teacherlist = atten.viewattendenc();
        ModelAndView mv = new ModelAndView("viewteacher");
        mv.addObject("teacherlist", teacherlist);
        return mv;
    }

    @RequestMapping("/editingattendence")
    public ModelAndView editoneattendenc(@RequestParam("getatid") int atnid) {
        String attendencelist = atten.viewattendenc();
        String studentlist = stinfo.viewstudent();
        String streglist = streg.viewStudentregistration();
        String classlist = classser.viewClassname();
        String grouplist = stgroup.viewStgroup();
        String sectiontlist = classsec.viewClasssection();
        ModelAndView mv = new ModelAndView("admin/attendence", "attendenceObject", atten.viewOneattendenc(atnid));
        mv.addObject("attendencelists", attendencelist);
        mv.addObject("studentlists", studentlist);
        mv.addObject("streglists", streglist);
        mv.addObject("classlists", classlist);
        mv.addObject("grouplists", grouplist);
        mv.addObject("sectiontlists", sectiontlist);
        mv.addObject("check", "false");
        return mv;
    }

}
