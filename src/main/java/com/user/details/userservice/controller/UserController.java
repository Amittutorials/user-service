package com.user.details.userservice.controller;

import com.user.details.userservice.model.UserEntity;

import com.user.details.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class  UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserEntity createUserEntity(@RequestBody UserEntity user) {
        return userService.createUserEntity(user);

    }

    @GetMapping("/getAllUserDetails")
    public List<UserEntity> getAllUser() {
        return userService.getAllUser();

    }

    @GetMapping("/getUserDetails/{userId}")
    public Optional<UserEntity> getUserDetails(@PathVariable("userId") int id) {
        return userService.getUserDetails(id);
    }
    @PutMapping("/updateUser/{id}")
    public UserEntity updateUser(@RequestBody UserEntity user) {
        userService.updateUserDetails(user);
        return user;
    }
    @DeleteMapping("/getAllUserDetails/{id}")
    public void deleteUserDetails(@PathVariable int id) {
        userService.userDelete(id);
    }
    @GetMapping("/getUserDetails")
    public List<UserEntity> getAllUserDetailsByName(@RequestParam(name = "userName") String userName) {
       return userService.getAllUserDetailsByName(userName);

    }

}
