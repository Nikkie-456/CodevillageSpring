package com.thecodevillage.myapp.user.service;

import com.thecodevillage.myapp.item.models.GenericResponse;
import com.thecodevillage.myapp.user.model.User;
import com.thecodevillage.myapp.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public GenericResponse fetchAllUsers() {
        return null;
    }

    @Override
    public GenericResponse getUserByCode(String Code) {
        return null;
    }

    @Override
    public GenericResponse saveUser(User user){
        User user1 = userRepository.save(user);
        if (user1.getId() > 0){
        return new GenericResponse(2001, "User Created Successfully",user1);}
        return new GenericResponse(2005, "Error Creating User");
    }

    @Override
    public GenericResponse updateUser(User user) {
        return null;
    }


}
