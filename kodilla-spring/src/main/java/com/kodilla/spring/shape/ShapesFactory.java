package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {

    @Bean
    public Square createSquare() {
        return new Square();
    }

    @Bean
    public Shape chosenShape(){
        Shape theShape;
        Random rand = new Random();
        int chosen = rand.nextInt(3);
        if(chosen == 0){
            theShape = new Triangle();
        } else if(chosen == 1){
            theShape = new Square();
        } else {
            theShape = new Square();
        }
        return theShape;
    }
}
