package com.aitubank.springaitubank.services;

import com.aitubank.springaitubank.models.User;
import com.aitubank.springaitubank.repositories.UserRepositoriyInterface;
import com.aitubank.springaitubank.services.Interfaces.UserServicesInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServicesInterface {

    private final UserRepositoriyInterface repo;

    public UserService(UserRepositoriyInterface repo) {
        this.repo = repo;
    }


    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public User create(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getBySurname(String surname) {
        return repo.findBySurname(surname);
    }
}
