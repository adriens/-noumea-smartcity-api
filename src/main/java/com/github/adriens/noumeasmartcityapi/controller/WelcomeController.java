/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.noumeasmartcityapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author salad74
 */
@RestController
public class WelcomeController {
    @GetMapping("/")
    public String getServiceInfo(){
        return "Hub d'APIs pour Noumea Smart City";
    }
}
