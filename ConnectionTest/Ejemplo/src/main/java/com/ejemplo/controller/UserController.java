package com.ejemplo.controller;


import com.ejemplo.data.UserRegister;
import com.ejemplo.data.UserResponse;
import com.ejemplo.model.User;
import com.ejemplo.repository.UserRepository;
import com.ejemplo.service.UserService;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.net.URI;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody UserRegister userRegister){
        UserResponse userResponse = userService.register(userRegister);
        return ResponseEntity.ok(userResponse);
    }
}
