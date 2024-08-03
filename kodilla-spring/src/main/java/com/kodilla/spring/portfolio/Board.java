package com.kodilla.spring.portfolio;

import org.springframework.scheduling.config.Task;

import java.util.List;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;
    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addToDo(String task) {
        toDoList.add(task);
    }
    public void addInProgress(String task) {
        inProgressList.add(task);
    }
    public void addDone(String task) {
        doneList.add(task);
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
