package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

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
        int id = taskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
