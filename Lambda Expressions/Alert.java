import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    Alert(String type) { this.type = type; }
    public String toString() { return type; }
}

public class HospitalApp {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Emergency"),
            new Alert("Appointment Reminder"),
            new Alert("Health Tip"),
            new Alert("Lab Report Ready")
        );

        Predicate<Alert> isImportant = alert -> alert.type.equals("Emergency") || alert.type.equals("Lab Report Ready");

        alerts.stream()
              .filter(isImportant)
              .forEach(System.out::println);
    }
}
