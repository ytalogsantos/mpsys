package com.ytalogsantos.mpsys.controllers;

import com.ytalogsantos.mpsys.models.User;
import com.ytalogsantos.mpsys.services.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        try {
            return userServiceImpl.save(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null; // TODO return the correct HTTP status code
        }
        // TODO handle errors correctly
    }

    @GetMapping
    public List<User> getUsers() {
        try {
            System.out.println("It works.");
            return userServiceImpl.getAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null; // TODO return the correct HTTP status code
        }
        // TODO handle errors correctly
    }
}
