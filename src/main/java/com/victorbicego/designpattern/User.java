package com.victorbicego.designpattern;

public class User {
    private String firstName; //required
    private String lastName; //required
    private int age; //optional
    private String email; //optional
    private String idNumber; //optional

    private User(UserBuilder u) {
        this.firstName = u.firstName;
        this.lastName = u.lastName;
        this.age = u.age;
        this.email = u.email;
        this.idNumber = u.idNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String idNumber;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder idNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
