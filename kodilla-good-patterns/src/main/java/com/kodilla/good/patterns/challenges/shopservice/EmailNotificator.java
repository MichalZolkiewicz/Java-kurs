package com.kodilla.good.patterns.challenges.shopservice;

public class EmailNotificator implements InformationService{

    @Override
    public void informUser(User user) {
        System.out.println("Send email to: " + user.getEmailAddress());
    }
}
