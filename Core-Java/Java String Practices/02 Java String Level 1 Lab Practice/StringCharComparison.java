import java.util.Scanner;

public class StringCharComparison {

    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] userDefinedChars = getChars(input);
        char[] builtInChars = input.toCharArray();

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        System.out.println("User-defined method chars: ");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }
        System.out.println("\nBuilt-in toCharArray() chars: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println("\nAre both arrays equal? " + areEqual);
    }
}
