package com.aitubank.springaitubank.repositories;

import com.aitubank.springaitubank.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoriyInterface extends JpaRepository<User, Integer> {
}
