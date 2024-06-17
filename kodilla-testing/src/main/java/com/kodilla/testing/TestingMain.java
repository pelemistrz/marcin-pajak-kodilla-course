package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {
       Calculator calculator = new Calculator();
       int a = 15;
       int b = 12;
       int resultSubstraction =3;
       int resultAddition = 27;

       if(resultAddition == calculator.add(a,b)){
           System.out.println("Test for addition is ok");
       } else {
           System.out.println("Test for addition failed");
       }
       if(resultSubstraction == calculator.subtract(a,b)){
           System.out.println("Test for subtraction is ok");
       } else {
           System.out.println("Test for subtraction failed");
       }
    }
}