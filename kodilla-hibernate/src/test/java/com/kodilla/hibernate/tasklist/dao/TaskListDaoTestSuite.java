package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;

    @Test
    void testTaskListDaoFindByListName(){
        //given
        TaskList taskList = new TaskList("In progress","work in progress");
        //when
        taskListDao.save(taskList);
        //when
        List<TaskList> taskLists = taskListDao.findByListName("In progress");
        //then
        assertEquals(1,taskLists.size());
        //clean up

        taskListDao.deleteAll();
    }
    @Test
    void testTaskDaoSaveWithFinancialDetails(){
        //given
        Task task = new Task("DESCRIPTION",30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120),false));
        //when
        taskDao.save(task);
        int id = task.getId();
        //then
        assertNotEquals(0,id);
    }
    @Test
    void testTaskListDaoSaveWithTasks(){
        //given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("LISTNAME", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //when
        taskListDao.save(taskList);
        int id = taskList.getId();
        //then
        assertNotEquals(0,id);
    }
}
