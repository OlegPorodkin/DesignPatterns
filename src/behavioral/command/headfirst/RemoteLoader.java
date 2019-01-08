package behavioral.command.headfirst;

import behavioral.command.headfirst.commands.*;
import behavioral.command.headfirst.function.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        TV tv = new TV("Living Room");
//        Light kitchenLight = new Light("Kitchen");
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOnWithCDCommand, tvOnCommand,hottubOnCommand};
        Command[] partyOff = {lightOff, stereoOffCommand, tvOffCommand, hottubOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//
//        CeilingFanMediumSpeedCommand fanMediumSpeedCommand = new CeilingFanMediumSpeedCommand(ceilingFan);
//        CeilingFanHighSpeedCommand fanHighSpeedCommand = new CeilingFanHighSpeedCommand(ceilingFan);
//        CeilingFanOffCommand fanOffCommand =new CeilingFanOffCommand(ceilingFan);
//
//        GarageDoorUpCommand doorUpCommand = new GarageDoorUpCommand(garageDoor);
//        GarageDoorDownCommand doorDownCommand = new GarageDoorDownCommand(garageDoor);
//
//        StereoOnWithCDCommand onWithCDCommand = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

//        remoteControl.setCommand(0, fanMediumSpeedCommand, fanOffCommand);
//        remoteControl.setCommand(1, fanHighSpeedCommand, fanOffCommand);
//        remoteControl.setCommand(2, fanOnCommand, fanOffCommand);
//        remoteControl.setCommand(3, onWithCDCommand, stereoOffCommand);
//        remoteControl.setCommand(4, onWithCDCommand, stereoOffCommand);
//        remoteControl.setCommand(5, onWithCDCommand, stereoOffCommand);

//        remoteControl.onButtonWasPressed(0);
//        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        System.out.println("---Pushing Macro ON---");
        remoteControl.onButtonWasPressed(0);
        System.out.println("---Pushing Macro OFF---");
        remoteControl.offButtonWasPressed(0);
    //        System.out.println(remoteControl);
    //        remoteControl.undoButtonWasPressed();

//        System.out.println(remoteControl);

//        remoteControl.onButtonWasPressed(0);
//        remoteControl.offButtonWasPressed(0);
//        remoteControl.onButtonWasPressed(1);
//        remoteControl.offButtonWasPressed(1);
//        remoteControl.onButtonWasPressed(2);
//        remoteControl.offButtonWasPressed(2);
//        remoteControl.onButtonWasPressed(3);
//        remoteControl.offButtonWasPressed(3);
    }
}
