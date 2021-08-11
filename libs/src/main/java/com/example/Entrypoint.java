package com.example;


import java.util.Base64;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;


public class Entrypoint {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        for(String arg : args) {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(arg.getBytes(StandardCharsets.US_ASCII));
            byte[] encoded = Base64.getEncoder().encode(arg.getBytes());
            System.out.println(new String(encoded));
        }

    }

}
