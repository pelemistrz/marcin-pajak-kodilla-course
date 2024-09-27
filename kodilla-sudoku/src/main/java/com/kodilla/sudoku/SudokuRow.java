package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    List<SudokuElement> row  = new ArrayList<>();

    public SudokuRow() {
        for (int i = 0; i < 9; i++) {
            row.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getRow() {
        return row;
    }

    public void setRow(List<SudokuElement> row) {
        this.row = row;
    }
}
