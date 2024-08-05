package com.kodilla.good.patterns.carService;

public class Application {
    public static void main(String[] args) {
        RentRequesterRetriever rentRequesterRetriever = new RentRequesterRetriever();
        RentRequest rentRequest = rentRequesterRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(new MailService())
    }
}
