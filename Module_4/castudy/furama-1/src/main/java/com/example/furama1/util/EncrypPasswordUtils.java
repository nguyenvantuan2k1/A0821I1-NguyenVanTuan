package com.example.furama1.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncrypPasswordUtils {

    public static String EncrypPasswordUtils(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        return encoder.encode(password);
    }

    public static void main(String[] args) {
        System.out.println("pass 123456 ma hoa thanh: " + EncrypPasswordUtils("123456"));
//        $2a$10$nRHxKq2.MpBWErcx2P.YOOOPtHePCV1LPF9rQ4pPxHsNCDRJ6lumu
    }


}
