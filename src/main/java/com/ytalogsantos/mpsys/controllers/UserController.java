package com.ytalogsantos.mpsys.controllers;

import com.ytalogsantos.mpsys.models.User;
import com.ytalogsantos.mpsys.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        try {
            return userService.createUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        // TODO handle errors correctly
    }

    @GetMapping
    public List<User> getUsers() {
        try {
            return userService.getUsers();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        // TODO handle errors correctly
    }
}
