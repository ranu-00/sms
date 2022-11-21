package com.ranu.erp.school.entities;


public class UserModel {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private String userPhone;

    private String roles;

    public UserModel(String email, String password, String name, String lastName, String userPhone,  String roles) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.userPhone = userPhone;

        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
