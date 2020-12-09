package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getListToDo(), getListInProgress(), getListDone());
    }

    @Bean(name = "toDoList")
    public TaskList getListToDo() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getListInProgress() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList getListDone() {
        return new TaskList();
    }
}
