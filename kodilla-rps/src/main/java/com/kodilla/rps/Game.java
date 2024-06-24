package com.kodilla.rps;

public class Game {
    private Score score;
    private Computer computer = new Computer();

    public Game(int totalNumbersOfRoundToWin){
        score = new Score(totalNumbersOfRoundToWin);
    }

    private void showResults(){
        System.out.println("You have " + score.getGamesWonByUser() + " points");
        System.out.println("Computer has " + score.getGamesWonByComputer() + " points");
    }
    public boolean checkResult(){
        if (score.getGamesWonByComputer() == score.getTotalNumbersOfRoundsToWin() || score.getGamesWonByUser() == score.getTotalNumbersOfRoundsToWin()){
            return true;
        } else {
            return false;
        }
    }
    public void isWinner(){
        showResults();
        if (score.getGamesWonByComputer() == score.getTotalNumbersOfRoundsToWin()){
            System.out.println("Computer has won!");
        } else {
            System.out.println("You have won!");
        }
    }



    public String welcomeMessege(String gamerName){
        return "Welcome " + gamerName+" below is information how to play:\nIf you press 1 you choose rock\nIf you press 2 you choose paper\n"+
                "If you press 3 you choose scissors\nPress x to end the game\n"+
                "Press n to rerun the game";
    }
    public void reset(){
        score.reset();
    }


    public void generateResult(int moveUser) {
        int computerMove = computer.move();
        switch (moveUser) {
            case 1:
                if (computerMove == 1) {
                    System.out.println("You choose rock");
                    System.out.println("Computer choose rock");
                    System.out.println("Draw");
                    showResults();
                } else if (computerMove == 2) {
                    System.out.println("You choose rock");
                    System.out.println("Computer choose paper");
                    System.out.println("Computer won");
                    score.incrementGamesWonByComputer();
                    showResults();
                } else if (computerMove == 3) {
                    System.out.println("You choose rock");
                    System.out.println("Computer choose scissors");
                    score.incrementGamesWonByUser();
                    System.out.println("You won");
                    showResults();
                }
                break;
            case 2:
                if (computerMove == 1) {
                    System.out.println("You choose paper");
                    System.out.println("Computer choose rock");
                    score.incrementGamesWonByComputer();
                    System.out.println("You won");
                    showResults();
                } else if (computerMove == 2) {
                    System.out.println("You choose scissors");
                    System.out.println("Computer choose paper");
                    System.out.println("Draw");
                    showResults();
                } else if (computerMove == 3) {
                    System.out.println("You choose paper");
                    System.out.println("Computer choose scissors");
                    score.incrementGamesWonByComputer();
                    System.out.println("Computer won");
                    showResults();
                }
                break;
            case 3:
                if (computerMove == 1) {
                    System.out.println("You choose scissors");
                    System.out.println("Computer choose rock");
                    score.incrementGamesWonByComputer();
                    System.out.println("Computer won");
                    showResults();
                } else if (computerMove == 2) {
                    System.out.println("You choose rock");
                    System.out.println("Computer choose paper");
                    System.out.println("You won");
                    score.incrementGamesWonByUser();
                    showResults();
                } else if (computerMove == 3) {
                    System.out.println("You choose paper");
                    System.out.println("Computer choose paper");
                    System.out.println("There is draw");
                    showResults();
                }
                break;
        }
    }


}
