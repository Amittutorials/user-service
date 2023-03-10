package com.user.details.userservice.service;

import com.user.details.userservice.model.UserEntity;
import com.user.details.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public UserEntity createUserEntity(UserEntity user) {
        return userRepository.save(user);
    }

    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserDetails(int id) {
        return userRepository.findById(id);
    }

    public UserEntity updateUserDetails(UserEntity user) {
        Optional<UserEntity> existingUser = userRepository.findById(user.getId());
        if (existingUser.isPresent()) {
            UserEntity updatedUser = existingUser.get();
            updatedUser.setUserName(user.getUserName());
            updatedUser.setPassword(user.getPassword());
            updatedUser.setUserAge(user.getUserAge());
            userRepository.save(updatedUser);
        }
        return user;
    }

    public void userDelete(int id) {
        userRepository.deleteById(id);

    }

    public List<UserEntity> getAllUserDetailsByName(String userName) {
       return userRepository.findByUserName(userName);
    }
}
