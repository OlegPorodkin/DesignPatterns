package command.headfirst;

import command.headfirst.commands.Command;

public class RemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }

    public void offButtonWasPressed(int slot){
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------Remote Control------\n");
        for (int i = 0; i < onCommand.length; i++) {
            stringBuffer.append("[slot" + i + "] " + onCommand[i].getClass().getName()
            + "\t\t\t" + offCommand[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
