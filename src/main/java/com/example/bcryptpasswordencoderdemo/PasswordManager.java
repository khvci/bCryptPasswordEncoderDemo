package com.example.bcryptpasswordencoderdemo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordManager {
    int strength = 7;
    PasswordEncoder bCryptEncoder = new BCryptPasswordEncoder(strength);

    String rawPassword = "buBirSifre123";
    String firstEncodedPassword = bCryptEncoder.encode(rawPassword);
    String secondEncodedPassword = bCryptEncoder.encode(rawPassword);
    boolean isMatch1 = bCryptEncoder.matches(rawPassword, firstEncodedPassword);
    boolean isMatch2 = bCryptEncoder.matches(rawPassword, secondEncodedPassword);

}
