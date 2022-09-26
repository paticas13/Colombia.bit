/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alfa4
 */
@Controller
public class Controlador {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @GetMapping("/registro")
    public String registro(){
        return "registro";
    }
}
