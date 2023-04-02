package com.ProGrad.ArtGallery.service;

import com.ProGrad.ArtGallery.Authentication.AuthenticationRequest;
import com.ProGrad.ArtGallery.Authentication.AuthenticationResponse;
import com.ProGrad.ArtGallery.Authentication.AuthenticationService;
import com.ProGrad.ArtGallery.Authentication.RegisterRequest;

import com.ProGrad.ArtGallery.model.User;
import com.ProGrad.ArtGallery.repositry.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class UserSignupService {
    @Autowired
  private UserRepository userRepository;
    @Autowired
  private AuthenticationService authenticationService;
    public AuthenticationResponse register(RegisterRequest request) {

       return  authenticationService.register(request);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

}
