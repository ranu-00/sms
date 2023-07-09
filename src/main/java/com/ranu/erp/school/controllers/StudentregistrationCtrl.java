package com.ranu.erp.school.controllers;

import com.ranu.erp.school.entities.Studentregistration;
import com.ranu.erp.school.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class StudentregistrationCtrl {
    @Autowired
    StudentregistrationService streg;
    @Autowired
    StudentinfoService stinfo;

    @Autowired
    ClassnameService classser;
    @Autowired
    ClasssectionService classsec;
    @Autowired
    StgroupService stgroup;

    @Autowired
    AcademicyearService year;

    @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        //binder.setDisallowedFields(new String[]{"empMobile"});
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        binder.registerCustomEditor(Date.class, "regdate", new CustomDateEditor(format, false));
//        binder.registerCustomEditor(String.class, "ename", new EmployeeNameEditor());
    }

    @RequestMapping("/showregistrationpage")
    public ModelAndView showstudentregpage() {
        String streglist = streg.viewStudentregistration();
        String classlist = classser.viewClassname();
        String classseclist = classsec.viewClasssection();
        String stgrouplist = stgroup.viewStgroup();
        String stinfolist = stinfo.viewstudent();
        String yearlist = year.viewAcademicyear();

        ModelAndView mv = new ModelAndView("admin/studentregistration", "stregistrationObject", new Studentregistration());
        mv.addObject("streglists", streglist);
        mv.addObject("classlists", classlist);
        mv.addObject("classseclists", classseclist);
        mv.addObject("stgrouplists", stgrouplist);
        mv.addObject("stinfolists", stinfolist);
        mv.addObject("yearlists", yearlist);

        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/registrationpage", params = "Add")
    public String addstudentreg(@ModelAttribute("stregistrationObject") Studentregistration rgid, HttpServletRequest request) {
        try {
            streg.insertStudentregistration(rgid);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/showregistrationpage";
    }

    @RequestMapping(value = "/registrationpage", params = "Edit")
    public String editstudentreg(@ModelAttribute("stregistrationObject") Studentregistration rgid, HttpServletRequest request) {
        streg.updateStudentregistration(rgid.getRegid(), rgid);

        return "redirect:/showregistrationpage";
    }

    @RequestMapping("removingreg/{regtrid}")
    public String removestudentreg(@PathVariable("regtrid") int regitrd) {
        streg.deleteStudentregistrationr(regitrd);
        return "redirect:/showregistrationpage";
    }

    @RequestMapping("/editingreg")
    public ModelAndView editonesteudentreg(@RequestParam("getregid") int regtrid) {
        String streglist = streg.viewStudentregistration();
        String classlist = classser.viewClassname();
        String classseclist = classsec.viewClasssection();
        String stgrouplist = stgroup.viewStgroup();
        String stinfolist = stinfo.viewstudent();
        String yearlist = year.viewAcademicyear();
        ModelAndView mv = new ModelAndView("admin/studentregistration", "stregistrationObject", streg.viewOneStudentregistration(regtrid));
        mv.addObject("streglists", streglist);
        mv.addObject("classlists", classlist);
        mv.addObject("classseclists", classseclist);
        mv.addObject("stgrouplists", stgrouplist);
        mv.addObject("stinfolists", stinfolist);
        mv.addObject("yearlists", yearlist);
        return mv;
    }
}
