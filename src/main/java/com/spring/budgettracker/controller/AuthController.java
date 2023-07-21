package com.spring.budgettracker.controller;

import com.spring.budgettracker.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUser(@RequestBody User user){
        return new User();
    }
}
