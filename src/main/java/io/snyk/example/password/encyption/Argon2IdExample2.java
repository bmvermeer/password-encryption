package io.snyk.example.password.encyption;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Argon2IdExample2 {

    public static void main(String[] args) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id, 32, 64);
        var myPassword = "ThisIsMyPassword";

        var hash = argon2.hash(2,15*1024,1, myPassword.toCharArray());
        System.out.println(hash);

        var validPassword = argon2.verify(hash, myPassword.toCharArray());
        System.out.println(validPassword);
    }
}
