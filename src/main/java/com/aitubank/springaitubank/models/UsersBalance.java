package com.aitubank.springaitubank.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usersBalance")

public class UsersBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private double balance;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "balance_id")
    private User user;

}
