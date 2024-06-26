package com.kodilla.rps;

import java.util.Random;

public class Computer {
    public int move(int moveUser) {

        Random rand = new Random();
        int chances = rand.nextInt(1000);
        if (chances < 250) {
            switch (moveUser) {
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 1;
            }


        }
        return rand.nextInt(3) + 1;
    }
}
