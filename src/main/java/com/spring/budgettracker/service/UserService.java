package com.spring.budgettracker.service;

import com.spring.budgettracker.model.User;
import com.spring.budgettracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    public void createUser(User user){
        Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
        if(userOptional.isPresent()){

        }
    }
}
