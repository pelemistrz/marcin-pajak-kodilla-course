package com.kodilla.good.patterns.chalanges;

public class MailService implements InformationService {
    @Override
    public void inform(User User) {
        System.out.println("Sending email about placing order");
    }
}
