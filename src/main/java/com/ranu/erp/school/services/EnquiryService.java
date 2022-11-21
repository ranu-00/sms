package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.EnquiryModel;

public interface EnquiryService {

    public EnquiryModel getEnquiry(Long id);

    public void addEnquiry(EnquiryModel enquiry);
}
