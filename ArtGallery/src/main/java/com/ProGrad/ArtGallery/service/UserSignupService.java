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

    public ResponseEntity<User> addUser(User user) {
        User checkingForExixtingUser = userORM.findByEmail(user.getEmail());
        if(checkingForExixtingUser == null) {
            userORM.save(user);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    public List<User> getUsers() {
        return userORM.findAll();
    }
}
