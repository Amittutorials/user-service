package com.user.details.userservice.service;

import com.user.details.userservice.model.UserEntity;
import com.user.details.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;
    public UserEntity createUserEntity( UserEntity user)
    {
        return userRepository.save(user);
    }
    public List<UserEntity> getAllUser(){
        return  userRepository.findAll();
    }
    public List<UserEntity> getUserDetails(int id)
    {
        return  userRepository.findById(id);


    }
}
