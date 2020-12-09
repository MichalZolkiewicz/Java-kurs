package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void logOperation() {
        logger = Logger.INSTANCE;
        logger.log("first log");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        System.out.println("Log attempt: " + lastLog);
        //Then
        assertEquals("first log", lastLog);
    }
}
