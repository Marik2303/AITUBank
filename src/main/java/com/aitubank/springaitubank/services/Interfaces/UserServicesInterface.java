package com.aitubank.springaitubank.services.Interfaces;

import com.aitubank.springaitubank.models.User;

import java.util.List;

public interface UserServicesInterface {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    List<User> getBySurname(String surname);
}
