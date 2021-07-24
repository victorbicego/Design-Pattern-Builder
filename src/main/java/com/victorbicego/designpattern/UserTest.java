package com.victorbicego.designpattern;

public class UserTest {
    public static void main(String[] args) {

        User firstUser = new User.UserBuilder("Victor", "Bicego")
                .age(30)
                .email("victor.bicego")
                .idNumber("123-456")
                .build();

        System.out.println(firstUser);


        User secondUser = new User.UserBuilder("Giovana", "Yokota")
                .idNumber("678-123")
                .build();

        System.out.println(secondUser);
    }
}
