package com.thecodevillage.myapp.user.service;

import com.thecodevillage.myapp.user.model.User;
import com.thecodevillage.myapp.user.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> fetchAllUsers() {
        return null;
    }

    @Override
    public User getUserByCode(String Code) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
