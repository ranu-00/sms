package com.ranu.erp.school.controllers;

import com.ranu.erp.school.entities.Payment;
import com.ranu.erp.school.services.AcademicyearService;
import com.ranu.erp.school.services.PaymentService;
import com.ranu.erp.school.services.StudentregistrationService;
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
public class PaymentCtrl {
    @Autowired
    PaymentService payment;
    @Autowired
    StudentregistrationService streg;
    @Autowired
    AcademicyearService year;
    @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        //binder.setDisallowedFields(new String[]{"empMobile"});
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        binder.registerCustomEditor(Date.class, "paydate", new CustomDateEditor(format, false));
//        binder.registerCustomEditor(String.class, "ename", new EmployeeNameEditor());
    }

    @RequestMapping("/showpaymentpage")
    public ModelAndView showpaypage() {
        String payamount = payment.viewMonthlypayment();
        String stregistration = streg.viewStudentregistration();
        String yeargsonlist = year.viewAcademicyear();
        ModelAndView mv = new ModelAndView("admin/payment", "paymentObject", new Payment());
        mv.addObject("payamount", payamount);
        mv.addObject("stregistration", stregistration);
        mv.addObject("yearmodelobject", yeargsonlist);
        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/paymentadd", params = "Add")
    public String addpaypage(@ModelAttribute("paymentObject") Payment pay, HttpServletRequest request) {
        payment.insertMonthlypayment(pay);
        return "redirect:/showpaymentpage";
    }

    @RequestMapping(value = "/paymentadd", params = "Edit")
    public String editpaypage(@ModelAttribute("paymentObject") Payment pay, HttpServletRequest request) {
        payment.updateMonthlypayment(pay.getPayid(), pay);
        return "redirect:/showpaymentpage";
    }

    @RequestMapping("removingpayment/{payid}")
    public String removepaypage(@PathVariable("payid") int payid) {
        payment.deleteMonthlypayment(payid);
        return "redirect:/showpaymentpage";
    }

    @RequestMapping("/editingpaymayment")
    public ModelAndView editpaymentpage(@RequestParam("getpayid") int payid) {
        String payamount = payment.viewMonthlypayment();
        String stregistration = streg.viewStudentregistration();
        String yeargsonlist = year.viewAcademicyear();
        ModelAndView mv = new ModelAndView("admin/payment", "paymentObject", payment.viewOneMonthlypayment(payid));
        mv.addObject("payamount", payamount);
        mv.addObject("stregistration", stregistration);
        mv.addObject("yearmodelobject", yeargsonlist);
        mv.addObject("check", "false");
        return mv;
    }


}
