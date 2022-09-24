package model;

import interfaces.ICommand;

public class Invoker {
    private ICommand UpCommand, DownCommand, LeftCommand, RightCommand, SpecialAttribute;

    public Invoker(ICommand upCommand, ICommand downCommand, ICommand leftCommand, ICommand rightCommand, ICommand specialAttribute) {
        UpCommand = upCommand;
        DownCommand = downCommand;
        LeftCommand = leftCommand;
        RightCommand = rightCommand;
        SpecialAttribute = specialAttribute;
    }
    public void arrowUp(){
        UpCommand.execute();
    }
    public void arrowDown(){
        DownCommand.execute();
    }
    public void arrowRight(){
        RightCommand.execute();
    }
    public void arrowLeft(){
        LeftCommand.execute();
    }
    public void arrowSpecial(){
        SpecialAttribute.execute();
    }
}
