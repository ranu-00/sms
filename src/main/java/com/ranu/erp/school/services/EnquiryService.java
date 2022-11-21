package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.EnquiryModel;

public interface EnquiryService {

    public boolean getEnquiry(String email);

    public void addEnquiry(EnquiryModel enquiry);
}
