/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String indexLogin() {
        return "/login";
    }
}
