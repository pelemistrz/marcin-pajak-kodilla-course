package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoggerTestSuite {
    @Test
    void testLastLog(){
        //given
        Logger logger = Logger.LOG;
        logger.setLog("Hello World");
        Logger logger2 = Logger.LOG;
        logger2.setLog("Marcin Pajak, last update: 01.10.2022");
        logger.setLog("Stanisla Pyta, latest update: 01.10.2022");
        //when & then
        assertEquals("Stanisla Pyta, latest update: 01.10.2022", logger2.getLastLog());
        assertNotEquals("Marcin Pajak, last update: 01.10.2022", logger2.getLastLog());
        assertEquals("Stanisla Pyta, latest update: 01.10.2022", logger.getLastLog());
    }
}
