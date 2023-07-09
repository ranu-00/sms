package com.ranu.erp.school.restcontroller;

import com.ranu.erp.school.entities.Menus;
import com.ranu.erp.school.repositories.MenusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class RestMenuController {
    @Autowired
    private MenusRepository menusRepository;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/rest/menus")
    public List<Menus> getMenuItems(){
        return menusRepository.findAll();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/rest/test")
    public String getNameTest(@RequestParam(name="name") String name){
        if(name.equals("Home"))
            return "{\"nameJ\":\"Sunil Rana\"}";
        return "{\"nameJ\":\"Anuj Rana\"}";
    }

}
