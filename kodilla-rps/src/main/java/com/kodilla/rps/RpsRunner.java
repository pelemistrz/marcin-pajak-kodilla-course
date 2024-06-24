package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcom in the Game of Rock, Paper,Scissors\nPlease provide your name");
        String gamerName = scanner.nextLine();
        System.out.println("How many winning rounds do you want to play?");
        int rounds = scanner.nextInt();
        scanner.nextLine();

        String choice;

        Game game = new Game(rounds);

        System.out.println(game.welcomeMessege(gamerName));
        do{
            System.out.println("\nPlease enter your move");
            choice = scanner.nextLine();
            switch (choice) {
                case "x":
                    System.out.println("Do you really want finish the game? Y/N ");
                    String s = scanner.nextLine();
                    if (s.equals("Y")) {
                        exit(0);
                    }
                    break;
                case "n":
                    System.out.println("Do you really want start again? Y/N ");
                    choice = scanner.nextLine();
                    if (choice.equals("Y")) {
                        game.reset();
                        System.out.println("\n\nGame has been started again");
                    }
                    break;
                default:
                    game.generateResult(Integer.parseInt(String.valueOf(choice)));
                    break;
            }
            if(game.checkResult()){
                game.isWinner();
                System.out.println("Please enter x for exit or n for rerun the game");
                choice = scanner.nextLine();
                if (choice.equals("x")) {
                    System.out.println("Exit the game");
                    exit(0);
                } else {
                    System.out.println("Rerun the game");
                    game.reset();
                }
            }
        } while(true);
    }
}