package com.moonjong.gradleapp;

import com.moonjong.gradleapp.entity.User;
import com.moonjong.gradleapp.repository.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ListController {

    private final UserRepository userRepository;

    public ListController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/api/user")
    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
