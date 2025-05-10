package com.sumit.cicd_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public String homePage(){
        return "WElCOME TO JSPL HOME ";
    }
}
