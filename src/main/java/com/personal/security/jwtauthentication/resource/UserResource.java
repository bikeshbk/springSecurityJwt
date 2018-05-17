package com.personal.security.jwtauthentication.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    @GetMapping("users")
    public String getUsers(){
        return "This is the list of users";
    }

}
