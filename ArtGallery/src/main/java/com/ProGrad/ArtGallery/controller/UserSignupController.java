package com.ProGrad.ArtGallery.controller;

import com.ProGrad.ArtGallery.model.User;
import com.ProGrad.ArtGallery.service.UserSignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserSignupController {
    private UserSignupService userSignupService;

    @Autowired
    public UserSignupController(UserSignupService userSignupService) {
        this.userSignupService = userSignupService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return userSignupService.addUser(user);
    }
    @GetMapping("/users")
    public List<User> getUsers() {
        return userSignupService.getUsers();
    }
}
