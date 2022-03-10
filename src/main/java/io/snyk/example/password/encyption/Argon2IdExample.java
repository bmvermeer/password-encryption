package io.snyk.example.password.encyption;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

public class Argon2IdExample {

    public static void main(String[] args) {
        Argon2PasswordEncoder encoder = new Argon2PasswordEncoder(32,64,1,15*1024,2);
        var myPassword = "ThisIsMyPassword";

        var encodedPassword = encoder.encode(myPassword);
        System.out.println(encodedPassword);

        var validPassword = encoder.matches(myPassword, encodedPassword);
        System.out.println(validPassword);
    }
}
