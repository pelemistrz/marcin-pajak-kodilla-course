package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
       double result = 0;
        try {
            result = firstChallenge.divide(2.0, 0);
        } catch (ArithmeticException e) {
            System.out.println("Is forbidden divide by 0 " + e);
            System.out.println("The divide cannot be process");
        } finally {
            System.out.println("If below is printed 0. It means the function divide throwed Exception");
        }

        System.out.println(result);
    }
}
