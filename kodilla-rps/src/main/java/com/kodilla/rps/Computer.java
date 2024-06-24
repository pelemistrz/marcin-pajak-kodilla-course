package com.kodilla.rps;

import java.util.Random;

public class Computer {
    public int move(){

        Random rand = new Random();
        return rand.nextInt(3)+1;

    }
}
