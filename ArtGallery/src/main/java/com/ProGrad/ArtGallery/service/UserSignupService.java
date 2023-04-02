package com.ProGrad.ArtGallery.service;

import com.ProGrad.ArtGallery.model.User;
import com.ProGrad.ArtGallery.repositry.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSignupService {
    private UserRepository userORM;

    public UserSignupService(UserRepository userORM) {
        this.userORM = userORM;
    }

    public ResponseEntity<String> addUser(User user) {

        Optional<User> checkingForExistingUser = userORM.findByEmail(user.getEmail());
        if(checkingForExistingUser == null) {
            userORM.save(user);
            return new ResponseEntity<>("User Created Successfully",HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>("Please try to login",HttpStatus.BAD_REQUEST);
        }
    }

    public List<User> getUsers() {
        return userORM.findAll();
    }
}
