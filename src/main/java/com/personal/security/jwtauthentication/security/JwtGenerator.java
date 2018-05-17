package com.personal.security.jwtauthentication.security;


import com.personal.security.jwtauthentication.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {


    public String generate(JwtUser jwtUser) {
        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUsername());
        claims.put("userId", String.valueOf(jwtUser.getId()));
        claims.put("role", jwtUser.getRole());

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "jwt123")
                .compact();
    }
}
