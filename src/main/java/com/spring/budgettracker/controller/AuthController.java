package com.spring.budgettracker.controller;

import com.spring.budgettracker.model.User;
import com.spring.budgettracker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private final UserService userService;
    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public void registerUser(@RequestBody User user){
       userService.register(user);
    }
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public User login(@RequestBody User user){
        return userService.login(user);
    }
}
