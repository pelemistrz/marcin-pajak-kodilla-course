package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String stringSecondChallange = "";
        try{
            stringSecondChallange = secondChallenge.probablyIWillThrowException(3,3);
            System.out.println(stringSecondChallange);
        } catch (Exception e){
            System.out.println("Please use method probablyIWillThrowException with arguments: first in range (2,1] and second different than 1.5 ");
        } finally {
            System.out.println("It has been done");
        }
    }
}
