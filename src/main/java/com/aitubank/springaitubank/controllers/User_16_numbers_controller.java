package com.aitubank.springaitubank.controllers;

import com.aitubank.springaitubank.models.Users_16_numbers;
import com.aitubank.springaitubank.services.Interfaces.UserServicesInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sixteenNumbers")

public class User_16_numbers_controller {

    private final UserServicesInterface service; //Ссылка на сервис для работы с данными пользователей

    // Конструктор контроллера, принимающий сервис в качестве аргумента

    public User_16_numbers_controller(UserServicesInterface service){
        this.service = service;
    }
}
