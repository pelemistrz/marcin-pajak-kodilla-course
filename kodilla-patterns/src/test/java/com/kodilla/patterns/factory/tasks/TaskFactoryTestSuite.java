package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryPaintingTask(){
        //given
        //when
        Task paintingTask = TaskFactory.createTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();;
        //then
        assertEquals("Weekend painting", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());

    }
    @Test
    void testFactoryDrivingTask(){
       //when
        Task drivingTask = TaskFactory.createTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();
        //then
        assertEquals("monday driving", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }
    @Test
    void testFactoryShoppingTask(){
        //when
        Task shoppingTask = TaskFactory.createTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        //then
        assertEquals("weekend shopping", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());

    }
}
