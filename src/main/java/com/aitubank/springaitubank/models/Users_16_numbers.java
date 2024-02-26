package com.aitubank.springaitubank.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users_16_numbers")

public class Users_16_numbers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sixteenNumbers;
}
