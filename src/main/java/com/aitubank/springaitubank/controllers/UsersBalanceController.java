package com.aitubank.springaitubank.controllers;
import com.aitubank.springaitubank.models.UsersBalance;
import com.aitubank.springaitubank.services.Interfaces.UserServicesInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mybank")
public class UsersBalanceController {

    private final UserServicesInterface service;


    public UsersBalanceController(UserServicesInterface service) {
        this.service = service;
    }

}
