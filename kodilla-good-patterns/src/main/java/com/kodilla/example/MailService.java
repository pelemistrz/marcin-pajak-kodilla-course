package com.kodilla.example;



public class MailService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("sending email");
    }
}
