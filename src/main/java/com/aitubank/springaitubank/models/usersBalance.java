package com.aitubank.springaitubank.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usersBalance")
public class usersBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double balance;
}
