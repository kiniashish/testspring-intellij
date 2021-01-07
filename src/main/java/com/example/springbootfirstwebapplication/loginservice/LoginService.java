package com.example.springbootfirstwebapplication.loginservice;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean loginCheck(String userName, String password){
        return userName.equalsIgnoreCase("ashish") && password.equalsIgnoreCase("password");
    }
}
