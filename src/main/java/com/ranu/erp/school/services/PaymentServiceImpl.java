package com.ranu.erp.school.services;

import com.google.gson.Gson;
import com.ranu.erp.school.entities.Payment;
import com.ranu.erp.school.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public String insertMonthlypayment(Payment pay) {
        paymentRepository.save(pay);
        return null;
    }

    @Override
    public String updateMonthlypayment(int payid, Payment pay) {
        Payment onepayobject =paymentRepository.findById(payid).get();
        onepayobject.setPayid(pay.getPayid());
        onepayobject.setRegid(pay.getRegid());
        onepayobject.setPayofmonth(pay.getPayofmonth());
        onepayobject.setPayammount(pay.getPayammount());
        onepayobject.setPaydate(pay.getPaydate());
        paymentRepository.save(onepayobject);
        return null;
    }

    @Override
    public String deleteMonthlypayment(int payid) {
        Payment onepayobject =paymentRepository.findById(payid).get();
        paymentRepository.delete(onepayobject);
        return null;
    }

    @Override
    public String viewMonthlypayment() {
        List<Payment> paylist = paymentRepository.findAll();
        Gson g = new Gson();
        String ctlistgson = g.toJson(paylist);
        return ctlistgson;
    }

    @Override
    public Payment viewOneMonthlypayment(int payid) {
        return paymentRepository.findById(payid).get();
    }
}
