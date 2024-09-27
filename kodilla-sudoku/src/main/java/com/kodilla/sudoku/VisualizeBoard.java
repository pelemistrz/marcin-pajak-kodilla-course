package com.kodilla.sudoku;

public class VisualizeBoard {
    public static void visualizeBoard(SudokuBoard board) {
        String boardString = "";

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int val = board.getBoard().get(i).getRow().get(j).getValue();
                switch (val){
                    case -1: boardString += "|   "; break;
                    default: boardString += "| " + val+" "; break;
                }
            }
            boardString += "|\n";
            boardString += "|---|---|---|---|---|---|---|---|---|\n";
        }
        System.out.println(boardString);
    }
}
