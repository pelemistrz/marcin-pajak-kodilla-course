package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    SudokuBoard board;
    VisualizeBoard visualizeBoard;
    Scanner scanner = new Scanner(System.in);

    public SudokuGame() {
        this.board = new SudokuBoard();
        this.visualizeBoard = new VisualizeBoard();
    }

    public void play(){
        visualizeBoard.visualizeBoard(board);
        System.out.println("\n");
        for(int i=0;i<4;i++){
            String in = scanner.nextLine();
            int col = Character.getNumericValue(in.charAt(0))-1;
            int row = Character.getNumericValue(in.charAt(2))-1;
            int value = Character.getNumericValue(in.charAt(4));
            board.getBoard().get(row).getRow().get(col).setValue(value);
        }
        visualizeBoard.visualizeBoard(board);
    }

    public boolean resolved(){
        return false;
    }
}
