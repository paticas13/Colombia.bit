/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co;

import com.co.dao.userDAO;
import com.co.pojo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
        
        return "registro";
    }
    
    @GetMapping("/index_jobs")
    public String index_jobs(Model model){
        var usuarios = userDao.findAll();
        model.addAttribute("usuarios", usuarios);
        return "index_jobs";
    }
    
    @PostMapping("/guardar")
    public String guardar(Usuario usuarios1){
        userDao.save(usuarios1);
        return "redirect:/registro";
    }
    
    
}
