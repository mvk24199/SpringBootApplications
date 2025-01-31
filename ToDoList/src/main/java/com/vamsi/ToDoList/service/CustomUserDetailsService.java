package com.vamsi.ToDoList.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vamsi.ToDoList.entity.User;
import com.vamsi.ToDoList.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    private final UserRepository userRepository;
    public CustomUserDetailsService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) {
        // Replace with database logic to fetch user
        return User.builder()
            .username(username)
            .password("$2a$10$7s8pU/OyNQO6fh8y.qE/RuEcqSy1mpPKRQewG8yInxIozZP/o.MuK") // password = "password"
            .authorities(Collections.emptyList())
            .build();
    }

}
