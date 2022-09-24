package first.receiver.commands;

import interfaces.ICommand;
import model.FirstReceiver;

public class Right implements ICommand {
    private FirstReceiver firstReceiver;

    public Right(FirstReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    @Override
    public void execute() {
        firstReceiver.moveRight();
    }
}
