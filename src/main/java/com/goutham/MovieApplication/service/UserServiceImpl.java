package com.goutham.MovieApplication.service;

import com.goutham.MovieApplication.entity.User;
import com.goutham.MovieApplication.model.UserModel;
import com.goutham.MovieApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUserDetails(UserModel userModel) {
        User user = User.builder().
                userName(userModel.getName()).
                email(userModel.getEmail()).
                password(userModel.getPassword())
                .build();
        return userRepository.save(user);
    }

    @Override
    public List<User> getUserDetails() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getUserByUserName(String userName) {
        return userRepository.getUserByUserName(userName);
    }

    @Override
    public List<User> getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUserDetails(Long id, User userModel) {
        User user_details = userRepository.findById(id).get();

        if(Objects.nonNull(userModel.getUserName())){
            user_details.setUserName(userModel.getUserName());
        }
        if(Objects.nonNull(userModel.getEmail())){
            user_details.setEmail(userModel.getEmail());
        }
        if(Objects.nonNull(userModel.getPassword())){
            user_details.setPassword(userModel.getPassword());
        }
        return userRepository.save(user_details);
    }
    }

