package com.thecodevillage.myapp.user.service;

import com.thecodevillage.myapp.item.models.GenericResponse;
import com.thecodevillage.myapp.user.model.User;

import java.util.List;

public interface UserService {
    GenericResponse fetchAllUsers();

    GenericResponse getUserByCode(String Code);

    GenericResponse saveUser(User user);

    GenericResponse updateUser(User user);
}
