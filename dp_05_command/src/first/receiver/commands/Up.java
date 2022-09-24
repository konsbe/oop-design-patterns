package first.receiver.commands;

import interfaces.ICommand;
import model.FirstReceiver;

public class Up implements ICommand {
    private FirstReceiver firstReceiver; //instance reference to Receiver obj

    public Up(FirstReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    @Override
    public void execute() {
        firstReceiver.jumpUp();
    }
}
