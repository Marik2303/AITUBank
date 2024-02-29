package com.aitubank.springaitubank.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   //Выдаем юзеру айдишку

    private String name;   //Выдаем юзеру имя

    private String surname;

    private boolean gender;

    private String password;

}
