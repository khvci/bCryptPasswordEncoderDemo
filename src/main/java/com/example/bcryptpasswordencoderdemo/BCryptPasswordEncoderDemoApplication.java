package com.example.bcryptpasswordencoderdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BCryptPasswordEncoderDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(BCryptPasswordEncoderDemoApplication.class, args);
        PasswordManager passwordManager = new PasswordManager();
        System.out.println("raw password: " + passwordManager.rawPassword);
        System.out.println("first encoded password: " + passwordManager.firstEncodedPassword);
        System.out.println("second encoded password: " + passwordManager.secondEncodedPassword); //different from the first one
        System.out.println(passwordManager.isMatch1); // true
        System.out.println(passwordManager.isMatch2); // true

    }

}
