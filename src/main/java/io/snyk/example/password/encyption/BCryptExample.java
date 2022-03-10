package io.snyk.example.password.encyption;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.nio.charset.StandardCharsets;

public class BCryptExample {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(20);
        var myPassword = "ThisIsMyPassword";

        var encodedPassword = encoder.encode(myPassword);
        System.out.println(encodedPassword);

        var validPassword = encoder.matches(myPassword, encodedPassword);
        System.out.println(validPassword);
    }
}
