package com.aitubank.springaitubank.repositories;

import com.aitubank.springaitubank.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepositoriyInterface extends JpaRepository<User, Integer> {
    List<User> findBySurname(String surname);
}
