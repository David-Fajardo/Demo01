package academy.digital.demo01.service.impl;

import academy.digital.demo01.model.UserResponse;
import academy.digital.demo01.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserResponse getNameUser() {

        UserResponse userResponse=new UserResponse();
        userResponse.setNickName("Mar");
        userResponse.setLastName("Bravo");
        userResponse.setMail("MARBRAVO@HOTMAIL.COM");
        userResponse.setId("M25");
        return userResponse;
    }
}
