package com.ProGrad.ArtGallery.service;

import com.ProGrad.ArtGallery.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSignupService {
    private List<User> users = new ArrayList<>();

    public ResponseEntity<String> addUser(User user) {
        int n = this.users.size();
        for(int i = 0; i < n; i++) {
            if(this.users.get(i).getEmail().equalsIgnoreCase(user.getEmail())) {
                return new ResponseEntity<>( "user already exist",HttpStatus.FORBIDDEN);
            }
        }
        this.users.add(user);
        return new ResponseEntity<>("User created", HttpStatus.CREATED);
    }

    public List<User> getUsers() {
        return users;
    }
}
