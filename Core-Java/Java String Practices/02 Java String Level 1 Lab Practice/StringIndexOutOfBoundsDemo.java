import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String str) {
        System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
    }

    public static void handleException(String str) {
        try {
            System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // generateException(input);

        handleException(input);

        scanner.close();
    }
}
