package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {
    private final String name;
    private int tasksToCheck;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksToCheck tasksToCheck) {
        this.tasksToCheck ++;
        System.out.println("You have new task to check from "+ tasksToCheck.getCoursant()+". In total you have "+ 
        this.tasksToCheck +" to check.");
    }

    public void checkTask(){
        this.tasksToCheck--;
    }

    public String getName() {
        return name;
    }

    public int getTasksToCheck() {
        return tasksToCheck;
    }
}
