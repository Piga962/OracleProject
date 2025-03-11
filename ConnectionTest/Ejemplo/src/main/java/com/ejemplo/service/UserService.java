package com.ejemplo.service;


import com.ejemplo.data.UserRegister;
import com.ejemplo.data.UserResponse;
import com.ejemplo.model.User;
import com.ejemplo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponse register(UserRegister userRegister){
        User user = userRepository.save(new User(userRegister, "Admin"));
        return new UserResponse(user.getName(), user.getEmail(), user.getRole());
    }

}
