import java.util.Scanner;

public class SubstringComparison {

    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String substrCharAt = substringUsingCharAt(text, start, end);

        String substrBuiltIn = "";
        if (start >= 0 && end <= text.length() && start < end) {
            substrBuiltIn = text.substring(start, end);
        } else {
            System.out.println("Invalid indices for substring method.");
        }

        boolean areEqual = compareStringsUsingCharAt(substrCharAt, substrBuiltIn);

        System.out.println("Substring using charAt(): " + substrCharAt);
        System.out.println("Substring using substring(): " + substrBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);

        scanner.close();
    }
}
