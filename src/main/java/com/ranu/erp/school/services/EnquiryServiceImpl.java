package com.ranu.erp.school.services;

import com.ranu.erp.school.entities.EnquiryModel;
import com.ranu.erp.school.repositories.EnquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnquiryServiceImpl implements EnquiryService{
    @Autowired
    private EnquiryRepository enquiryRepository;
    @Override
    public boolean getEnquiry(String email) {
        if(null!=enquiryRepository.findByEmail(email))
        return false;
        else
        return true;
    }

    @Override
    public void addEnquiry(EnquiryModel enquiry) {
        enquiryRepository.save(enquiry);
    }
}
