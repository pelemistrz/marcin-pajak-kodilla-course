package com.kodilla.hibernate.taks.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskFinancialDetailsDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {
    @Autowired
    private TaskFinancialDetailsDao dao;

    @Test
    void testFindByPaid(){
        //given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(15),false);
        dao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();
        //when
        List<TaskFinancialDetails> resultList = dao.findByPaid(false);
        //then
        assertEquals(1, resultList.size());
        //clean up
        dao.deleteById(id);
    }
}
