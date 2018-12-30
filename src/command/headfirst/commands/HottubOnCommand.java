package command.headfirst.commands;

import command.headfirst.function.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOn();
    }

    @Override
    public void undo() {
        hottub.jetsOff();
    }
}
