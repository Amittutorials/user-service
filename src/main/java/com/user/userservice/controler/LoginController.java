package com.user.userservice.controler;


import com.user.userservice.dto.LoginDetailsDto;
import com.user.userservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/login-details")
public class LoginController {

    @Autowired
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    @GetMapping
    public String getLoginDetailsWithoutURL() {

        return "Abhishek";
    }
    @GetMapping("/login")
    public LoginDetailsDto getLoginDetails(@RequestBody LoginDetailsDto loginDetailsDto) {
        System.out.println("UserName: " +loginDetailsDto.getUserName());
        System.out.println("Password: " +loginDetailsDto.getPassword());
        return loginDetailsDto;
    }


    @GetMapping("/login-repo")
    public List<LoginDetailsDto> getLoginDetailsByRepo() {
        List<LoginDetailsDto> ldd = loginService.getLoginDetails();
        return ldd;
    }


}



