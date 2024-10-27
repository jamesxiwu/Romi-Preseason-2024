package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LEDs extends SubsystemBase {

  /*
   * LED's are of the DigitalOutput class
   *  Constructor:
   *    DigitalOutput​(int channel)
   *  Channels:
   *    1 - Green
   *    2 - Red
   *    3 - Yellow
   *  e.g. DigitalOutput greenLED = new DigitalOutput(1);
   */

  //Create component instance variables:
  DigitalOutput greenLED;
  DigitalOutput redLED;
  DigitalOutput yellowLED;
  boolean greenOn = false;
  boolean redOn = false;
  boolean yellowOn = false;


  //instantiate component variables in the constructor
  public LEDs() {
    greenLED = new DigitalOutput(1);
    redLED = new DigitalOutput(2);
    yellowLED = new DigitalOutput(3);

    //turn off all LED's
    turnOffGreen();
    turnOffRed();
    turnOffYellow();
  }

  // Create methods to set LED's

  public void turnOnGreen() {
    greenLED.set(true);
    greenOn = true;
  }

  public void turnOffGreen() {
    greenLED.set(false);
    greenOn = false;
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

  // Create methods to "get" LED's

  public boolean getGreenStatus() {
    return greenOn;
  }

  public boolean getRedStatus() {
    return redOn;
  }

  public boolean getYellowStatus() {
    return yellowOn;
  }

  // Alternative approach involving toggling LED's
  // public void toggleGreen() {
  //   if (greenOn) {
  //     turnOffGreen();
  //   } else {
  //     turnOnGreen();
  //   }
  // }

  // public void toggleRed() {
  //   if (redOn) {
  //     turnOffRed();
  //   } else {
  //     turnOnRed();
  //   }
  // }

  // public void toggleYellow() {
  //   if (yellowOn) {
  //     turnOffYellow();
  //   } else {
  //     turnOnYellow();
  //   }
  // }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}