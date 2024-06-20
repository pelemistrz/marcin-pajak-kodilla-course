package com.kodilla.stream;

import com.kodilla.stream.beutifier.PoemBeutifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionCalculator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeutifier poemBeutifier = new PoemBeutifier();

        poemBeutifier.beutify("Ala ma kota", s -> s.toUpperCase());
        poemBeutifier.beutify("Ala ma kota", s -> "ABC" + s);
        poemBeutifier.beutify("Ala ma kota", s -> s + "ABC");
        poemBeutifier.beutify("Ala ma kota", s -> s.toLowerCase());
        poemBeutifier.beutify("Ala ma kota", s -> s.substring(0,s.length()/2) + " WOW "+s.substring(s.length()/2));

    }
}