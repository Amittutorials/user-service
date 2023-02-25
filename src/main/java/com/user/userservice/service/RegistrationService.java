package com.user.userservice.service;




import com.user.userservice.dto.RegistrationDto;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
@Component
public class RegistrationService {
    private static List<RegistrationDto> list=new ArrayList<>();

    static {
        list.add(new RegistrationDto("Amit","4545"));
        list.add(new RegistrationDto("Suraj","6754"));
    }


    public List<RegistrationDto> getRegistrationDto()
    {

        return list;

    }
    public RegistrationDto addRegistration(RegistrationDto b)
    {
        list.add(b);
        return b;
    }
}






