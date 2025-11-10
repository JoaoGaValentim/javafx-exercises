package br.com.exercises.counter.models;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyEvent(double value);
}
