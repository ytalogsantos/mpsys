package com.ytalogsantos.mpsys.services;

import com.ytalogsantos.mpsys.models.User;
import com.ytalogsantos.mpsys.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        // TODO verify if the user already exists before trying to save (maybe in the controller layer)
        // TODO handle errors correctly
    }

    public List<User> getUsers() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        // TODO handle errors correctly
    }
}
