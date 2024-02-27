package com.aitubank.springaitubank.controllers;


import com.aitubank.springaitubank.models.User;
import com.aitubank.springaitubank.services.Interfaces.UserServicesInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserServicesInterface service;

    public UserController(UserServicesInterface service) {
        this.service = service;
    }

    @GetMapping("auth")
    public String sayHello(){
        return "AITUBank.kz";
    }

    @GetMapping("/")
    public List<User> getAll(){
        return service.getAll();
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<User> getById(@PathVariable("user_id") int id){
        User user = service.getById(id);
        if(user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //404

        return new ResponseEntity<>(user, HttpStatus.OK); //200
    }

    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody User user){
        User createdUser = service.create(user);
        if(createdUser == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED); //201
    }

    @GetMapping("/surname/{user_surname}")
    public List<User> getBySurname(@PathVariable("user_surname") String surname){
        return service.getBySurname(surname);
    }

}
