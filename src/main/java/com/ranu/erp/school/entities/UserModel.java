package com.ranu.erp.school.entities;


import java.util.HashSet;
import java.util.Set;

public class UserModel {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private String userPhone;

    private Integer role;

      public UserModel(String email, String password, String name, String lastName, String userPhone, int role) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.userPhone = userPhone;
        this.role = role;
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

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
