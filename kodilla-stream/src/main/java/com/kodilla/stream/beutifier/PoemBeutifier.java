package com.kodilla.stream.beutifier;

public class PoemBeutifier {
    public void beutify(String text, PoemDecorator poemDecorator){
        String beutifyText  = poemDecorator.decorator(text);
        System.out.println("Beutify text: " + beutifyText);
    }
}
