package com.proGrad.ArtGallery;

import com.proGrad.ArtGallery.entity.UserEntity;
import com.proGrad.ArtGallery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ArtGalleryApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArtGalleryApplication.class, args);
	}

}
