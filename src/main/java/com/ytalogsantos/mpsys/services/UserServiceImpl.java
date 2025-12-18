package com.ytalogsantos.mpsys.services;

import com.ytalogsantos.mpsys.models.User;
import com.ytalogsantos.mpsys.repositories.UserRepository;
import com.ytalogsantos.mpsys.services.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        try {
            if (!userRepository.existsById(user.getId()))
                return userRepository.save(user);
            System.out.println("This user already exists. Try login.");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        // TODO verify if the user already exists before trying to save (maybe in the controller layer)
        // TODO handle errors correctly
    }

    public User find(String email) {
        try {
            return userRepository.findByEmail(email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<User> getAll() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        // TODO handle errors correctly
    }

    public Boolean update(User user) {
        try {
            if (!userRepository.existsById(user.getId())) {
                System.out.println("User not found.");
                return false;
            }
            User userToUpdate = new User();
            userToUpdate.setEmail(user.getEmail());
            userToUpdate.setPassword(user.getPassword());
            userRepository.save(userToUpdate);
            System.out.println("User updated");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void delete(Long id) {
        try {
            if (userRepository.existsById(id)) {
                userRepository.deleteById(id);
                System.out.println("User deleted.");
            }
            System.out.println("User not found.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getAccountType(User user) {
        try {
            if (userRepository.existsById(user.getId())) {
                String accountType = user.getAccount().getClass().toString(); // TODO test this
                System.out.println(accountType);
                return accountType;
            }
            System.out.println("User not found.");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void changeAccountStatus(User user) {
        try {

            if (!userRepository.existsById(user.getId())) {
                System.out.println("User not found.");
            }

            if (user.isActive()) {
                user.setActive(false);
                userRepository.save(user);
                System.out.println("Account deactivated.");
            } else {
                System.out.println("Account is already deactivated.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
