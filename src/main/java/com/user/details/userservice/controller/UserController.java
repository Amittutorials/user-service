package com.user.details.userservice.controller;

import com.user.details.userservice.model.UserEntity;
import com.user.details.userservice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class  UserController {
 @Autowired
 UserRepository userRepository;
@PostMapping("/usersave")
public UserEntity createUserEntity(@RequestBody UserEntity user)

{
    return userRepository.save(user);


}
@GetMapping("/getalluserdetails")
    public List<UserEntity> getUserEntity(){
    return (List<UserEntity>) userRepository.findAll();
}

}
