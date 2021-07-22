package com.victorbicego.designpattern;

public class UserTest {
    public static void main(String[] args) {

        User u1 = new User.UserBuilder("Victor", "Bicego")
                .age(30)
                .email("victor.bicego")
                .idNumber("123-456")
                .build();

        System.out.println(u1);


        User u2 = new User.UserBuilder("Giovana", "Yokota")
                .idNumber("678-123")
                .build();

        System.out.println(u2);
    }
}
