package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.Payment;

public interface PaymentService {
    public String insertMonthlypayment(Payment pay);

    public String updateMonthlypayment(int payid, Payment pay);

    public String deleteMonthlypayment(int payid);

    public String viewMonthlypayment();

    public Payment viewOneMonthlypayment(int payid);
}
