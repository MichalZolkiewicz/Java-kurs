package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getListToDo(), getListInProgress(), getListDone());
    }

    @Bean(name = "To do list")
    public TaskList getListToDo() {
        return new TaskList();
    }

    @Bean(name = "In progress list")
    public TaskList getListInProgress() {
        return new TaskList();
    }

    @Bean(name = "Done list")
    public TaskList getListDone() {
        return new TaskList();
    }
}
