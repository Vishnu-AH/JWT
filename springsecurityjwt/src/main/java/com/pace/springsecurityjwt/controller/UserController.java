package com.pace.springsecurityjwt.controller;

import com.pace.springsecurityjwt.entity.AuthenticationRequest;
import com.pace.springsecurityjwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;
    @GetMapping()
    public String welcome(){
        return "Welcome";
    }
    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthenticationRequest authenticationRequest)throws Exception{
        return jwtUtil.generateToken(authenticationRequest.getUserName());
    }

}
