package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksToCheck implements TaskObservable{
    private final String coursant;
    private final List<TaskObserver> mentors;
    private final Deque<String> tasks;

    public TasksToCheck(String coursant) {
        this.coursant = coursant;
        this.mentors = new ArrayList<>();
        this.tasks = new ArrayDeque<>();
    }


    public String getCoursant() {
        return coursant;
    }

    public List<TaskObserver> getMentors() {
        return mentors;
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.offerLast(task);
        notifyMentors();
    }
    public void checkTask(){
        tasks.pollFirst();
        for(TaskObserver mentor : mentors) {
            Mentor m = (Mentor) mentor;
            m.checkTask();
        }
    }

    @Override
    public void registerMentor(TaskObserver mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentors() {
        for (TaskObserver mentor : mentors) {
            mentor.update(this);
        }

    }

    @Override
    public void removeMentor(TaskObserver mentor) {
        mentors.remove(mentor);
    }
}
