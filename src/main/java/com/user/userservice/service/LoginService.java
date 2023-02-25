package com.user.userservice.service;


import com.user.userservice.dto.LoginDetailsDto;
import com.user.userservice.reposatory.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;
    public List<LoginDetailsDto> getLoginDetails(){
        List<LoginDetailsDto> ldd= loginRepository.getLoginDetails();
        return ldd;

    }

}
