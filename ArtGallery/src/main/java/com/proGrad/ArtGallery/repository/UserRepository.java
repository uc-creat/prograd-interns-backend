package com.proGrad.ArtGallery.repository;

import com.proGrad.ArtGallery.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
   public List<UserEntity> findByEmailIdAndPassword(String emailId, String password);
   public List<UserEntity> findByPassword(String password);
}
