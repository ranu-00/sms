package com.ranu.erp.school.entities;

import javax.persistence.*;

@Entity
public class Menus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer menu_id;
    @Column
    private String menu_name;
    public Menus(){}
    public Menus(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }
}
