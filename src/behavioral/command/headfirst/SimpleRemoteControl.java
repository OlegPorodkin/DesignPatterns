package behavioral.command.headfirst;

import behavioral.command.headfirst.commands.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void ButtonWasPressed(){
        slot.execute();
    }
}
