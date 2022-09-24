package first.receiver.commands;

import interfaces.ICommand;
import model.FirstReceiver;

public class Special implements ICommand {
    private FirstReceiver firstReceiver;

    public Special(FirstReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    @Override
    public void execute() {
        firstReceiver.moveFast();
    }
}
