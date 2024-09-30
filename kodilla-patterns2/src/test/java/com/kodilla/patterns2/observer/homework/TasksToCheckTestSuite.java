package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksToCheckTestSuite {
    @Test
    void testTasksUpdate(){
        //Given
        TasksToCheck coursant1tasksToCheck = new TasksToCheck("Coursant1");
        TasksToCheck coursant2tasksToCheck = new TasksToCheck("Coursant2");
        TasksToCheck coursant3tasksToCheck = new TasksToCheck("Coursant3");

        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        coursant1tasksToCheck.registerMentor(mentor1);
        coursant2tasksToCheck.registerMentor(mentor2);
        coursant3tasksToCheck.registerMentor(mentor1);

        coursant1tasksToCheck.addTask("Task1");
        coursant1tasksToCheck.addTask("Task2");
        coursant2tasksToCheck.addTask("Task3");
        coursant2tasksToCheck.addTask("Task 4");
        coursant3tasksToCheck.addTask("Task 5");
        coursant3tasksToCheck.addTask("Task 6");

        //When&&Then
        assertEquals(4,mentor1.getTasksToCheck());
        assertEquals(2,mentor2.getTasksToCheck());
    }
    @Test
    void testCheckTasks(){
        //Given
        TasksToCheck coursant1tasksToCheck = new TasksToCheck("Coursant1");
        TasksToCheck coursant2tasksToCheck = new TasksToCheck("Coursant2");
        TasksToCheck coursant3tasksToCheck = new TasksToCheck("Coursant3");

        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        coursant1tasksToCheck.registerMentor(mentor1);
        coursant2tasksToCheck.registerMentor(mentor2);
        coursant3tasksToCheck.registerMentor(mentor1);

        coursant1tasksToCheck.addTask("Task1");
        coursant1tasksToCheck.addTask("Task2");
        coursant2tasksToCheck.addTask("Task3");
        coursant2tasksToCheck.addTask("Task 4");
        coursant3tasksToCheck.addTask("Task 5");
        coursant3tasksToCheck.addTask("Task 6");
        //When
        coursant1tasksToCheck.checkTask();
        coursant3tasksToCheck.checkTask();
        assertEquals(2,mentor1.getTasksToCheck());

    }

}