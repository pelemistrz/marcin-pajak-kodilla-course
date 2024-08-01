package com.kodilla.patterns.checkers;

public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    private final Figure[][] board = new Figure[10][];

    public Board() {
        for (int i = 0; i < 10; i++) {
            board[i] = new Figure[10];
        }
    }
    public Figure getFigure(int row, int col) {
        return board[row][col];
    }
    public void setFigure(Figure figure,int row, int col) {
        board[row][col] = figure;
    }
    public String toString() {
        String result = "";
        for (int y = MIN_INDEX; y <= MAX_INDEX; y++) {
            result += "|";
            for (int x = MIN_INDEX; x <= MAX_INDEX; x++) {
                if (board[x][y] == null) {
                    result += "  ";
                } else {
                    result += (board[x][y]).getColor().equals(Figure.BLACK) ? "b" : "w";
                    result += (board[x][y]) instanceof Pawn ? "P" : "Q";
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}
