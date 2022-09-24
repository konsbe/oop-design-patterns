package first.receiver.commands;

import interfaces.ICommand;
import model.FirstReceiver;

public class Down implements ICommand {
    private FirstReceiver firstReceiver;

    public Down(FirstReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }
    @Override
    public void execute() {
        firstReceiver.moveDown();
    }
}
