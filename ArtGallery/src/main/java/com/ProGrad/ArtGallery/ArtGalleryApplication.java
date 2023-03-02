package com.ProGrad.ArtGallery;

import com.ProGrad.ArtGallery.service.UserSignupService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ArtGalleryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ArtGalleryApplication.class, args);
		context.getBean(UserSignupService.class);
	}

}
