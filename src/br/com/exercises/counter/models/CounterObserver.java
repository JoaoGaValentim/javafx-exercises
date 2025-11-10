package br.com.exercises.counter.models;

import java.util.ArrayList;
import java.util.List;

public class CounterObserver implements Subject {
    private double counter;
    private final List<Observer> observers;

    public CounterObserver() {
        observers = new ArrayList<>();
        counter = 0.0;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    public void increment() {
        counter++;
        notifyEvent(counter);
    }

    public void decrement() {
        counter--;
        notifyEvent(counter);
    }

    @Override
    public void notifyEvent(double value) {
        observers.forEach(o -> o.setState(value));
    }
}
