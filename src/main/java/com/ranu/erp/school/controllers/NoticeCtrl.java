package com.ranu.erp.school.controllers;

import com.ranu.erp.school.entities.Notice;
import com.ranu.erp.school.services.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class NoticeCtrl {
    @Autowired
    NoticeService sub;
    @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        binder.registerCustomEditor(Date.class, "noticedate", new CustomDateEditor(format, false));

    }


    @RequestMapping("/showingnoticepage")
    public ModelAndView showsubjectpage() {
        String subgsonlist = sub.viewNotice();
        ModelAndView mv = new ModelAndView("admin/notice", "addNoticeObject1", new Notice());
        mv.addObject("noticemodelobject", subgsonlist);
        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/addingnotice", params = "addnotice")
    public String addsubject(@ModelAttribute("addnoticeObject1") Notice s) {
        //String categorygsonlist = cdao.viewCategory();
        //ModelAndView mv =new ModelAndView("AddCategory");
        sub.insertNotice(s);
        //mv.addObject("categorymodelobject", categorygsonlist);
        return "redirect:/showingnoticepage";
    }

    @RequestMapping(value = "/addingnotice", params = "Editnotice")
    public String editsubject(@ModelAttribute("addNoticeObject1") Notice s) {

        //ModelAndView mv =new ModelAndView("AddCategory");
        sub.updateNotice(s);
        return "redirect:/showingnoticepage";
    }

    @RequestMapping("removenotice/{Id}")
    public String removesubject(@PathVariable("Id") int noticeid) {
        sub.deleteNotice(noticeid);
        return "redirect:/showingnoticepage";
    }

    @RequestMapping("/editnoticebutton")
    public ModelAndView passingonesubject(@RequestParam("getNoticeid") int noticeid) {

        Notice onesub = sub.viewOneNotice(noticeid);
        String subgsonlist = sub.viewNotice();
        ModelAndView mv = new ModelAndView("admin/notice", "addNoticeObject1", onesub);
        mv.addObject("noticemodelobject", subgsonlist);
        mv.addObject("check", "false");
        return mv;
    }
}
