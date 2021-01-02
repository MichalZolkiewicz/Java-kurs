package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    private static final String DESCRIPTION = "Creating TASKLIST entity";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("First Task List", DESCRIPTION);
        taskListDao.save(taskList);

        //When
        String listName = taskList.getListName();
        List<TaskList> readTasks = taskListDao.findByListName("First Task List");

        //Then
        assertEquals("First Task List", listName);

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
