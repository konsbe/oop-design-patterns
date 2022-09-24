import first.receiver.commands.*;
import model.FirstReceiver;
import model.Invoker;

public class Main {
    public static void main(String[] args) {

        //Creating Receiver you create secondReceiver with different attributes..
        FirstReceiver firstOne = new FirstReceiver();
        firstOne.setName("Mario");

        //Create Commands
        Down firstOneDown = new Down(firstOne);
        Up firstOneUp = new Up(firstOne);
        Right firstOneRight = new Right(firstOne);
        Left firstOneLeft = new Left(firstOne);
        Special firstOneSpecial = new Special(firstOne);

        //Invoker
        Invoker invoker = new Invoker(firstOneUp,firstOneDown,firstOneLeft,firstOneRight,firstOneSpecial);
        invoker.arrowDown();
        invoker.arrowSpecial();
    }
}