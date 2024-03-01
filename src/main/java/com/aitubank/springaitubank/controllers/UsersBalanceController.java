package com.aitubank.springaitubank.controllers;
import com.aitubank.springaitubank.models.UsersBalance;
import com.aitubank.springaitubank.services.Interfaces.UserServicesInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Rest Controller
@RequestMapping("mybank")
public class UsersBalanceController {

    private final UserServicesInterface service; // Приватное поле, содержащее ссылку на сервис для работы с балансом пользователей.


    public UsersBalanceController(UserServicesInterface service) {
        this.service = service;
    } // Конструктор контроллера, принимающий в качестве аргумента сервис для работы с балансом пользователей и инициализирующий поле service.

}
