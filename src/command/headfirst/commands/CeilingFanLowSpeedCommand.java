package command.headfirst.commands;

import command.headfirst.function.CeilingFan;

public class CeilingFanLowSpeedCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if (prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if (prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}