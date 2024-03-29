package model;

import interfaces.Observer;
import interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;
    //Reference to subject class
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this);
        if (msg ==null) System.out.println(name+" no new message on this topic");
        else System.out.println(name+ " Retrieving message: "+msg);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic=subject;
    }
}
