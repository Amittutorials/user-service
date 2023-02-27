package com.user.details.userservice.controller;

import com.user.details.userservice.model.UserEntity;
import com.user.details.userservice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
 @Autowired
 UserRepository userRepository;
@PostMapping("/usersave")
public UserEntity createUserEntity(@RequestBody UserEntity user)

{
    return userRepository.save(user);


}

}
