package com.goutham.MovieApplication.service;

import com.goutham.MovieApplication.entity.User;
import com.goutham.MovieApplication.model.UserModel;

import java.util.List;

public interface UserService {
    User saveUserDetails(UserModel userModel);

    List<User> getUserDetails();

    List<User> getUserByUserName(String userName);

    List<User> getUserById(Long id);

    void deleteUser(Long id);

    User updateUserDetails(Long id, User userModel);
}
