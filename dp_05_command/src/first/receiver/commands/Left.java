package first.receiver.commands;

import interfaces.ICommand;
import model.FirstReceiver;

public class Left implements ICommand {
    private FirstReceiver firstReceiver;

    public Left(FirstReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    @Override
    public void execute() {
        firstReceiver.moveLeft();
    }
}
