package com.ranu.erp.school.controllers;

import com.ranu.erp.school.entities.EnquiryModel;
import com.ranu.erp.school.services.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EnquiryController {

    @Autowired
    private EnquiryService enquiryService;
    @RequestMapping(value = "/enquirypanel", method = RequestMethod.GET)
    public String displayLogin(Model model) {
        model.addAttribute("enquiry", new EnquiryModel());
        model.addAttribute("errorenq","");
        return "enquiry";
    }

    @RequestMapping(value= "/enquiry", method = RequestMethod.POST)
    public ModelAndView enquiry(@ModelAttribute("enquiry") EnquiryModel enquiry) {

            if(enquiryService.getEnquiry(enquiry.getEmail())){
                ModelAndView mv = new ModelAndView("enquiry");
                enquiryService.addEnquiry(enquiry);
                mv.addObject("enquiry",new EnquiryModel());
                mv.addObject("errorenq","Success Submitted");
                return mv;
            }else{
                ModelAndView mv = new ModelAndView("enquiry");
                mv.addObject("errorenq","Email Already Exsist");
                return mv;
            }

    }
}
