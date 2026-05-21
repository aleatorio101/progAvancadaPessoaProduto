package com.example.demo.service;

import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserDetails loadUserByUsername(String userName)throws UsernameNotFoundException {
        return userRepo.findByLogin(userName);
    }
}
