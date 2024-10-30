package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LEDs extends SubsystemBase {
    
    private DigitalOutput greenLED;
    private boolean greenOn;

    private DigitalOutput redLED;
    private boolean redOn;

    private DigitalOutput yellowLED;
    private boolean yellowOn;

    public LEDs() {
        this.greenLED = new DigitalOutput(1);
        this.redLED = new DigitalOutput(2);
        this.yellowLED = new DigitalOutput(3);
    }

    public void turnOnGreen() {
        this.greenOn = true;
        greenLED.set(true);
    }

    public void turnOffGreen() {
        this.greenOn = false;
        greenLED.set(false);
    }

    public void turnOnRed() {
        redLED.set(true);
        redOn = true;
    }
    
    public void turnOffRed() {
        redLED.set(false);
        redOn = false;
    }

    public void turnOnYellow() {
        yellowLED.set(true);
        yellowOn = true;
    }

    public void turnOffYellow() {
        yellowLED.set(false);
        yellowOn = false;
    }

    // getter methods
    public boolean getGreenStatus() {
        return greenOn;
    }

    public boolean getRedStatus() {
        return redOn;
    }

    public boolean getYellowStatus() {
        return yellowOn;
    }


}
