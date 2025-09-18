import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String input) {
        System.out.println("Result: " + input.substring(5, 2));
    }

    public static void handleException(String input) {
        try {
            System.out.println("Result: " + input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // generateException(userInput);

        handleException(userInput);

        scanner.close();
    }
}
