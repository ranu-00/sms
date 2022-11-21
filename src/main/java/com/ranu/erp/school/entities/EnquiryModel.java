package com.ranu.erp.school.entities;

import javax.persistence.*;

@Entity
@Table(name = "enquiry")
public class EnquiryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enquiry_id")
    private Long id;
    @Column(name = "studentname")
    private String studentname;
    @Column(name = "fname")
    private String fname;
    @Column(name = "mname")
    private String mname;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "pincode")
    private String pincode;
    @Column(name = "userPhone")
    private String userPhone;
    @Column(name = "classs")
    private String classs;
    @Column(name = "addhar")
    private String addhar;
    @Column(name = "gender")
    private String gender;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "dob")
    private String dob;
    @Column(name = "status")
    private String status;
    @Column(name = "email")
    private String email;

    public EnquiryModel() {
    }

    public EnquiryModel(String studentname, String fname, String mname, String address, String city, String state, String pincode, String userPhone, String classs, String addhar, String gender, String nationality, String dob, String status, String email) {
        this.studentname = studentname;
        this.fname = fname;
        this.mname = mname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.userPhone = userPhone;
        this.classs = classs;
        this.addhar = addhar;
        this.gender = gender;
        this.nationality = nationality;
        this.dob = dob;
        this.status = status;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getAddhar() {
        return addhar;
    }

    public void setAddhar(String addhar) {
        this.addhar = addhar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
