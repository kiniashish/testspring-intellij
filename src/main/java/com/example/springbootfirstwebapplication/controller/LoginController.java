package com.example.springbootfirstwebapplication.controller;


import com.example.springbootfirstwebapplication.loginservice.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService check;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(ModelMap model){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

        if(check.loginCheck(name, password)) {
            model.put("name", name);
            return "welcome";
        }

        return "login";
    }
}
