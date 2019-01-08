package structural.bridge.refactoring;

import structural.bridge.refactoring.devices.Device;
import structural.bridge.refactoring.devices.Radio;
import structural.bridge.refactoring.devices.TV;
import structural.bridge.refactoring.remotes.AdvancedRemote;
import structural.bridge.refactoring.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    static void testDevice(Device device){
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
