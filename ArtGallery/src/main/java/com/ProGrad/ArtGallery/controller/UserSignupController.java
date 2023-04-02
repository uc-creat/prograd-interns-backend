package com.ProGrad.ArtGallery.controller;

import com.ProGrad.ArtGallery.Authentication.AuthenticationRequest;
import com.ProGrad.ArtGallery.Authentication.AuthenticationResponse;
import com.ProGrad.ArtGallery.Authentication.AuthenticationService;
import com.ProGrad.ArtGallery.Authentication.RegisterRequest;
import com.ProGrad.ArtGallery.model.User;
import com.ProGrad.ArtGallery.service.UserSignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserSignupController {

    private UserSignupService userSignupService;

    @Autowired
    public UserSignupController(UserSignupService userSignupService) {
        this.userSignupService = userSignupService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(userSignupService.register(request));
    }
    @GetMapping("/users")
    public List<User> getUsers() {
        return userSignupService.getUsers();
    }
}
