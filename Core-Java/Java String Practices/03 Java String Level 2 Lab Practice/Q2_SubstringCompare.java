import java.util.Scanner;
public class Q2_SubstringCompare {
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String manual = customSubstring(text, start, end);
        String builtin = text.substring(start, end);
        boolean result = compareStrings(manual, builtin);
        System.out.println("Manual substring: " + manual);
        System.out.println("Built-in substring: " + builtin);
        System.out.println("Are they equal? " + result);
    }
}