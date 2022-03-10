package io.snyk.example.password.encyption;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

public class SCryptExample {

    public static void main(String[] args) {
        SCryptPasswordEncoder encoder = new SCryptPasswordEncoder(32768, 8, 2, 32, 64);
        var myPassword = "ThisIsMyPassword";

        var encodedPassword = encoder.encode(myPassword);
        System.out.println(encodedPassword);

        var validPassword = encoder.matches(myPassword, encodedPassword);
        System.out.println(validPassword);
    }
}
