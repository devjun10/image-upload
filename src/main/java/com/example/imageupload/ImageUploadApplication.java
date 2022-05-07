package com.example.imageupload;

import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageUploadApplication.class, args);
    }


}
