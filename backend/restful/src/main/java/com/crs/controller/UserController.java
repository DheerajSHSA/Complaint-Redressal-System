package com.crs.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crs.model.User;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

    

    @PostMapping("/login")
    public User authUser(@RequestParam String username, @RequestParam String password, @RequestParam String userType) {
        System.out.println("Login params : " + username + "_" + password + " " + userType);
        
        return null;
    }
}
