package com.kodilla.patterns2.observer.homework;

public interface ObservableQueue {
    void registerObserver(QueueObserver queueObserver);
    void notifyObserver();
    void removeObserver(QueueObserver queueObserver);
}
