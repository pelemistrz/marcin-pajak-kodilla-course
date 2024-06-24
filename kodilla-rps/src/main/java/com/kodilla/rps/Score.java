package com.kodilla.rps;

public class Score {
    private int totalNumbersOfRoundsToWin = 0;
    private int gamesWonByUser = 0;
    private int gamesWonByComputer = 0;

    public Score(int totalNumbersOfRoundsToWin) {
        this.totalNumbersOfRoundsToWin = totalNumbersOfRoundsToWin;
    }
    public void incrementGamesWonByUser() {
        gamesWonByUser++;
    }
    public void incrementGamesWonByComputer() {
        gamesWonByComputer++;
    }

    public int getTotalNumbersOfRoundsToWin() {
        return totalNumbersOfRoundsToWin;
    }

    public int getGamesWonByUser() {
        return gamesWonByUser;
    }

    public int getGamesWonByComputer() {
        return gamesWonByComputer;
    }
    public void reset(){
        gamesWonByUser = 0;
        gamesWonByComputer = 0;
    }

}