package com.kodilla.sudoku;

import org.junit.jupiter.api.Test;

public class SudokuGameTestSuite {

    @Test
    void testSudokuGame() {
        SudokuBoard board = new SudokuBoard();
        VisualizeBoard visualizeBoard = new VisualizeBoard();
        board.getBoard().get(0).getRow().get(0).setValue(4);
        board.getBoard().get(0).getRow().get(2).setValue(5);
        board.getBoard().get(0).getRow().get(4).setValue(6);
        board.getBoard().get(0).getRow().get(8).setValue(7);

        board.getBoard().get(1).getRow().get(2).setValue(3);
        board.getBoard().get(1).getRow().get(5).setValue(5);
        board.getBoard().get(1).getRow().get(6).setValue(4);

        board.getBoard().get(2).getRow().get(0).setValue(9);
        board.getBoard().get(2).getRow().get(1).setValue(2);
        board.getBoard().get(2).getRow().get(2).setValue(8);
        board.getBoard().get(2).getRow().get(3).setValue(3);
        board.getBoard().get(2).getRow().get(5).setValue(4);

        board.getBoard().get(3).getRow().get(0).setValue(1);
        board.getBoard().get(3).getRow().get(1).setValue(5);
        board.getBoard().get(3).getRow().get(3).setValue(4);
        board.getBoard().get(3).getRow().get(6).setValue(8);
        board.getBoard().get(3).getRow().get(8).setValue(3);

        board.getBoard().get(4).getRow().get(2).setValue(6);
        board.getBoard().get(4).getRow().get(4).setValue(1);
        board.getBoard().get(4).getRow().get(7).setValue(5);

        board.getBoard().get(5).getRow().get(2).setValue(4);
        board.getBoard().get(5).getRow().get(3).setValue(7);
        board.getBoard().get(5).getRow().get(6).setValue(1);
        board.getBoard().get(5).getRow().get(7).setValue(6);
        board.getBoard().get(5).getRow().get(8).setValue(9);


        board.getBoard().get(6).getRow().get(0).setValue(6);
        board.getBoard().get(6).getRow().get(3).setValue(5);
        board.getBoard().get(6).getRow().get(5).setValue(1);
        board.getBoard().get(6).getRow().get(6).setValue(9);
        board.getBoard().get(6).getRow().get(7).setValue(4);
        board.getBoard().get(6).getRow().get(8).setValue(8);

        board.getBoard().get(7).getRow().get(0).setValue(8);
        board.getBoard().get(7).getRow().get(1).setValue(3);
        board.getBoard().get(7).getRow().get(3).setValue(6);
        board.getBoard().get(7).getRow().get(4).setValue(4);
        board.getBoard().get(7).getRow().get(8).setValue(5);

        board.getBoard().get(8).getRow().get(2).setValue(9);
        board.getBoard().get(8).getRow().get(3).setValue(8);


        visualizeBoard.visualizeBoard(board);


    }
}
