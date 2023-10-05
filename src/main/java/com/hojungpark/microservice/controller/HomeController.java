package com.hojungpark.microservice.controller;

import com.hojungpark.microservice.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/greetings")
    public String sayHello(){
        return "Hello World!";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User setUser(){
        User user = new User();
        user.setId("1234");
        user.setName("James");
        user.setEmail("james@gmail.com");
        return user;
    }
}
