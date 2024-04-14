package com.cpt202.demo.controller;

import com.cpt202.demo.entity.Manager;
import com.cpt202.demo.repository.ManagerRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ManagerController{
    @Autowired
    private ManagerRepo managerRepo;

    @GetMapping("/show/manager")
    public String getMG(Model m){
        List <Manager> managers = managerRepo.findAll();
        m.addAttribute("manager", managers);

        return "showManager";
    }

    @GetMapping("/add/manager")
    public String addMGp(Model m) {
        m.addAttribute("manager", new Manager());
        return "addManager";
    }
    @PostMapping("/add/manager")
    public String addMG(@ModelAttribute Manager m,Model nm) {
        //TODO: process POST request
        managerRepo.save(m);
        return "success";
    }
    
    
// @RestController
// public class ManagerController{
//     @Autowired
//     private ManagerRepo managerRepo;
    // @GetMapping("/api/show/manager")

    // public List<Manager> showmanager(){
    //     return managerRepo.findAll();
    // }
    
}