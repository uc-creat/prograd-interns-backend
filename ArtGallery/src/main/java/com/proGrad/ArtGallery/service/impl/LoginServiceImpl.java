package com.proGrad.ArtGallery.service.impl;

import com.proGrad.ArtGallery.entity.UserEntity;
import com.proGrad.ArtGallery.repository.UserRepository;
import com.proGrad.ArtGallery.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    private final UserRepository userRepository;
    private UserEntity userEntity;

    public LoginServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }


    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public String authenticate(UserEntity userEntity) {
        if (new ResponseEntity<List<UserEntity>>(userRepository.findByEmailIdAndPassword(userEntity.getEmailId(), userEntity.getPassword()), HttpStatus.OK).getBody().isEmpty()) {
            return ("First Signup and then Login");
        } else {
            return ("You are Logged In Successfully");
        }
    }


}
