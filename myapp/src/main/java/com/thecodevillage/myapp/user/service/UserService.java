package com.thecodevillage.myapp.user.service;

import com.thecodevillage.myapp.user.model.User;

import java.util.List;

public interface UserService {
    List<User> fetchAllUsers();

    User getUserByCode(String Code);

    User saveUser(User user);

    User updateUser(User user);
}
