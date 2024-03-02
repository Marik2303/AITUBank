package com.aitubank.springaitubank.models; // Объявляем пакет в котором находится класс

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   //Выдаем юзеру айдишку

    private String name;   //Выдаем юзеру имя

    private String surname; //Выдаем юзеру фамилию

    private boolean gender; //Выдаем пол юзеру

    private String password; //Выдаем юзеру пароль

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Users_16_numbers> users_16_numbersList = new ArrayList<Users_16_numbers>();

}
