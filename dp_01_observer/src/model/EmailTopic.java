package model;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {
    private List<Observer> observers;
    private String message;
    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer ==null) throw new NullPointerException("Null object/ Observer");
        if (!observers.contains(observer))observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Observer obs) {
        for(Observer observer: observers) if (observer != obs) {
            observer.update();
        };
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }
    public void postMessage(String msg, Observer obs){
        System.out.println("message posted to my topic "+msg+" From: "+ obs.getName());
        this.message =msg;
        notifyObservers(obs);
    }
}
