package frc.robot.subsystems.LEDs;

import edu.wpi.first.wpilibj.DigitalOutput;

public class LEDsIODigitalOutput implements LEDsIO {

    DigitalOutput green;
    DigitalOutput red;
    DigitalOutput yellow;

    public LEDsIODigitalOutput() {

        green = new DigitalOutput(1);
        red = new DigitalOutput(2);
        yellow = new DigitalOutput(3);

    }

    @Override // overrides method declaration in interface iirc
    public void updateInputs(LEDsIOInputs inputs) {

        inputs.greenOn = green.get();
        inputs.redOn = red.get();
        inputs.yellowOn = yellow.get();

    }

    @Override
    public void setGreen(boolean on) {
        green.set(on);
    } 

    @Override
    public void setRed(boolean on) {
        red.set(on);
    } 

    @Override
    public void setYellow(boolean on) {
        yellow.set(on);
    } 
}
