package com.thecodevillage.myapp.user.api;


import com.thecodevillage.myapp.item.models.GenericResponse;
import com.thecodevillage.myapp.user.model.User;
import com.thecodevillage.myapp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {

    private UserService userService;

    @Autowired
    public UserApi(UserService userService){this.userService = userService;}

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity createUser(@RequestBody User user) {
        try{
            System.out.println("Create New User");
            System.out.println("User Name: " +user.getUserName());
            userService.saveUser(user);
            GenericResponse genericResponse = new GenericResponse(2001, "User Created Successfully", user);
            return new ResponseEntity<>(genericResponse, HttpStatus.OK);}
        catch (Exception h){
            System.out.println("Error while creating user.");
        }
        return null;
    }

   @RequestMapping(value = "/view", method = RequestMethod.GET)
   public ResponseEntity viewUsers() {
        System.out.println("Fetch Users from  Database ");

        List<User> users = userService.fetchAllUsers();

       GenericResponse genericResponse = new GenericResponse(2002, "Users Fetched Successfully", users);

       return new ResponseEntity<>(genericResponse, HttpStatus.OK);
   }
}
