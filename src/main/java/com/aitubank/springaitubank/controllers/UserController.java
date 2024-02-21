package com.aitubank.springaitubank.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping("auth")
    public String sayHello(){
        return "AITUBank.kz";
    }

}
