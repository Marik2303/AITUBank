package com.aitubank.springaitubank.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usersBalance")

public class UsersBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id; // Уникальный идентификатор баланса пользователя

    private double balance;   //// Баланс пользователя
}
