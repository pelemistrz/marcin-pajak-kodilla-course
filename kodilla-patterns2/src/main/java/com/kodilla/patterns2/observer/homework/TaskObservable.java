package com.kodilla.patterns2.observer.homework;

public interface TaskObservable {
    void registerMentor(TaskObserver observer);
    void notifyMentors();
    void removeMentor(TaskObserver observer);
}
