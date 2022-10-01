/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co;

import com.co.dao.userDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Colombiabit
/**
 *
 * @author alfa4
 */
@Controller
public class Controlador {
    
    @Autowired
    private userDAO userDao;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @GetMapping("/registro")
    public String registro(){
        //var usuarios = userDao.findAll();
        //model.addAttribute("usuarios", usuarios);
        return "registro";
    }
    
    @GetMapping("/index_jobs")
    public String index_jobs(){
        return "index_jobs";
    }
}
