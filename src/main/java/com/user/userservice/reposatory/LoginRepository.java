package com.user.userservice.reposatory;


import com.user.userservice.dto.LoginDetailsDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoginRepository {

    public List<LoginDetailsDto> getLoginDetails() {
        List<LoginDetailsDto> list=new ArrayList<>();
        LoginDetailsDto amitObj=new LoginDetailsDto();
        amitObj.setUserName("Amit");
        amitObj.setPassword("78770");
        LoginDetailsDto surajObj=new LoginDetailsDto();
        surajObj.setUserName("Suraj");
        surajObj.setPassword("78770");
        list.add(amitObj);
        list.add(surajObj);
        return list;
    }
}
