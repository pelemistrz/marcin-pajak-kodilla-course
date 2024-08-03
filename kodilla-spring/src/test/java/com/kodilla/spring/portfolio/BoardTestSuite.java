package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    void testTaskAdd(){
        //given
        board.addToDo("Write exercise for Kodilla");
        board.addInProgress("Wash dishes");
        board.addDone("Work chapter 12");
        //when and then
        assertEquals("Write exercise for Kodilla",board.getToDoList().getTasks().get(0));
        assertEquals("Wash dishes",board.getInProgressList().getTasks().get(0));
        assertEquals("Work chapter 12",board.getDoneList().getTasks().get(0));
    }
}
