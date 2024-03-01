package com.aitubank.springaitubank.models; // Объявляем пакет в котором находится класс

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")

public class User {
    @Id //Первичный ключ
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   //Выдаем юзеру айдишку

    private String name;   //Выдаем юзеру имя

    private String surname; //Выдаем юзеру фамилию

    private boolean gender; //Выдаем пол юзеру

    private String password; //Выдаем юзеру пароль



}
