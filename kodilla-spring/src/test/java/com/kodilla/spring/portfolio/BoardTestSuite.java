package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        String doneTaskList = "Done list";
        String inProgressTaskList = "In progress list";
        String toDoTaskList = "To do list";

        board.getDoneList().addTask(doneTaskList);
        board.getInProgressList().addTask(inProgressTaskList);
        board.getToDoList().addTask(toDoTaskList);


        assertEquals(toDoTaskList, board.getToDoList().getTasks().get(0));
        assertEquals(inProgressTaskList, board.getInProgressList().getTasks().get(0));
        assertEquals(doneTaskList, board.getDoneList().getTasks().get(0));
    }
}
