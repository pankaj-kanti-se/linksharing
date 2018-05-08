package com.springbootjpa.controller;

import com.springbootjpa.domain.User;
import com.springbootjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class IndexController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String index() {
        Optional<User> user = userRepository.findUserById(1L);
        Optional<List<User>> users = userRepository.findAllByUserName("pankaj");
        return users.toString();
    }
}