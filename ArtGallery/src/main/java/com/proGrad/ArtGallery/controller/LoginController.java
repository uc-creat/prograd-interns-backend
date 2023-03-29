package com.proGrad.ArtGallery.controller;
import com.proGrad.ArtGallery.entity.UserEntity;
import com.proGrad.ArtGallery.repository.UserRepository;
import com.proGrad.ArtGallery.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController

public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String getUserByEmailIdAndPassword(@RequestBody UserEntity userEntity1) {

        return loginService.authenticate(userEntity1);
    }

    @GetMapping("/users")
    public List<UserEntity> findAllUsers()
    {
        return loginService.findAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<UserEntity> findById(@PathVariable("id") Long id)
    {
        return loginService.findById(id);
    }

    @PostMapping("/users")
    public UserEntity saveUser(@RequestBody UserEntity userEntity1)
    {
        return loginService.saveUser(userEntity1);
    }

}


