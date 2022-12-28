package com.zapdos7.designpatterns.structural.challenge5;

public class CarFaçade {
    public void drive() {
        Ignition ignition = new Ignition();
        Clutch clutch = new Clutch();
        Accelerator accelerator = new Accelerator();
        GearStick gearStick = new GearStick();
        Handbrake handbrake = new Handbrake();

        ignition.turnOn();
        clutch.press();
        gearStick.changeGear(1);
        accelerator.press();
        clutch.lift();
        handbrake.pushDown();
        accelerator.press();
        clutch.press();
    }
}
