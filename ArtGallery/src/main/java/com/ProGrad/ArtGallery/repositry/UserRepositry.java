package com.ProGrad.ArtGallery.repositry;

import com.ProGrad.ArtGallery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<User,Long> {
    public User findByEmail(String email);
}
