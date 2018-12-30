package command.headfirst.commands;

import command.headfirst.function.Hottub;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOff();
    }

    @Override
    public void undo() {
        hottub.jetsOn();
    }
}
