package frc.robot.subsystems.LEDs;

public interface LEDsIO {

    public static class LEDsIOInputs {
        boolean greenOn = false;
        boolean redOn = false;
        boolean yellowOn = false;
    }

    public default void setGreen(boolean on) {} 

    public default void setYellow(boolean on) {}

    public default void setRed(boolean on) {}

    public default void updateInputs(LEDsIOInputs inputs) {}

}
