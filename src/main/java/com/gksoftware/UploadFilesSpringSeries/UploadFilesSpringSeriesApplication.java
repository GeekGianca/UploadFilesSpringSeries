package com.gksoftware.UploadFilesSpringSeries;

import com.gksoftware.UploadFilesSpringSeries.propeties.StorageProperties;
import com.gksoftware.UploadFilesSpringSeries.services.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadFilesSpringSeriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadFilesSpringSeriesApplication.class, args);
	}

	@Bean
    CommandLineRunner init(StorageService storageService) {
	    return (args) -> {
	        storageService.deleteAll();
	        storageService.init();
        };
    }
}
