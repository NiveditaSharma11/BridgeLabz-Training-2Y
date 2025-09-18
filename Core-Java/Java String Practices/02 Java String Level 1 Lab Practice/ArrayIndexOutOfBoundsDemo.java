import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names) {
        System.out.println("Accessing index " + names.length + " (out of bounds):");
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index " + names.length + " (out of bounds) with exception handling:");
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // generateException(names);

        handleException(names);

        scanner.close();
    }
}
