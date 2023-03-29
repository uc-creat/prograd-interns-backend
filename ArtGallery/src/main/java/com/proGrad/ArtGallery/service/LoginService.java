package com.proGrad.ArtGallery.service;

import com.proGrad.ArtGallery.entity.UserEntity;
import com.proGrad.ArtGallery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface LoginService {
    List<UserEntity> findAllUsers();
    Optional<UserEntity> findById(Long id);
    UserEntity saveUser(UserEntity userEntity);
    String authenticate(UserEntity userEntity);
}
