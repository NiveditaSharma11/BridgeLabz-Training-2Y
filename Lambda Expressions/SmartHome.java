interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {
        // Define light behaviors dynamically using lambdas
        LightAction motionSensor = () -> System.out.println("Motion detected → Turn ON hallway lights");
        LightAction nightTime = () -> System.out.println("Night mode → Dim bedroom lights");
        LightAction voiceCommand = () -> System.out.println("Voice command → Turn ON living room lights");

        // Execute based on trigger
        motionSensor.execute();
        nightTime.execute();
        voiceCommand.execute();
    }
}
