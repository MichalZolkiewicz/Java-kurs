package com.kodilla.patterns2.observer.homework;

public class Mentor implements QueueObserver {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTaskQueue studentTaskQueue) {
        System.out.println(mentorName + ": New task in queue " + studentTaskQueue.getName() + "\n" +
                " (total: " + studentTaskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
