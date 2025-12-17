package com.ytalogsantos.mpsys.services.interfaces;

import com.ytalogsantos.mpsys.models.User;

import java.util.List;

public interface UserService {
    public User save(User user);
    public User find(String email);
    public List<User> getAll();
    public Boolean update(User user);
    public void delete(Long id);
    public String getAccountType();
    public void resetPassword();
    public void changeAccountStatus();

}
