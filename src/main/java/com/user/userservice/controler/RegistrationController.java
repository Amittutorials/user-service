package com.user.userservice.controler;



import com.user.userservice.dto.RegistrationDto;
import com.user.userservice.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/registration")
    public List<RegistrationDto> getRegistrations() {
        return this.registrationService.getRegistrationDto();
    }

    @PostMapping("/registration")
    public RegistrationDto addRegistrations(@RequestBody RegistrationDto registration)
    {
        RegistrationDto b= this.registrationService.addRegistration(registration);
        return b;
    }


}

