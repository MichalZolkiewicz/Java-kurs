package com.kodilla.good.patterns.challenges.shopservice;

public class User {

    private String name;
    private String address;
    private String emailAddress;

    public User(String name, String address, String emailAddress) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
