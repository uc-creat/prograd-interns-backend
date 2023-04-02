package com.ProGrad.ArtGallery.service;

import com.ProGrad.ArtGallery.model.User;
import com.ProGrad.ArtGallery.repositry.UserRepositry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSignupService {
    private UserRepositry userORM;

    public UserSignupService(UserRepositry userORM) {
        this.userORM = userORM;
    }

    public ResponseEntity<String> addUser(User user) {

        User checkingForExistingUser = userORM.findByEmail(user.getEmail());
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
