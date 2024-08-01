package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BoardTestSuite {
    @Test
    void testToString(){
        //given
        //creating the taksklisk for todos
        TasksList listToDo = new TasksList("To Do Tasks");
        IntStream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To do task number "+n)));
        //creatin the TasksList in progress
        TasksList listInProgress = new TasksList("In Progress");
        IntStream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In progress task number "+n)));
        //creatin the tasks list for done tasks
            TasksList listDone = new TasksList("Done");
            IntStream.iterate(1, i -> i + 1)
                    .limit(10)
                    .forEach(n -> listDone.getTasks().add(new Task("Done task number "+n)));
            //creatin board
        Board board = new Board("Project 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making shallow copy
        Board clonedBoard = null;
        try{
            clonedBoard = board.clone();
            clonedBoard.setName("Project 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making deep copy
        Board deepClonedBoard = null;
        try{
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //when
        board.getLists().remove(listToDo);
        //then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        assertEquals(2,board.getLists().size());
        assertEquals(2,clonedBoard.getLists().size());
        assertEquals(3,deepClonedBoard.getLists().size());
        assertEquals(clonedBoard.getLists(),board.getLists());
        assertNotEquals(deepClonedBoard.getLists(),board.getLists());
    }

}
