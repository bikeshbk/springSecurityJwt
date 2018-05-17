package com.personal.security.jwtauthentication.resource;

import com.personal.security.jwtauthentication.model.JwtUser;
import com.personal.security.jwtauthentication.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenResource {

    private JwtGenerator jwtGenerator;

    public TokenResource(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser){

       return jwtGenerator.generate(jwtUser);
    }

}
