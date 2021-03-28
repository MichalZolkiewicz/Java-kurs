package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTaskQueue implements ObservableQueue {
    private final List<QueueObserver> observers;
    private final Deque<String> tasks;
    private final String name;

    public StudentTaskQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObserver();
    }
    @Override
    public void registerObserver(QueueObserver queueObserver) {
        observers.add(queueObserver);
    }

    @Override
    public void notifyObserver() {
        for (QueueObserver queueObserver: observers) {
            queueObserver.update(this);
        }
    }

    @Override
    public void removeObserver(QueueObserver queueObserver) {
        observers.remove(queueObserver);
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
