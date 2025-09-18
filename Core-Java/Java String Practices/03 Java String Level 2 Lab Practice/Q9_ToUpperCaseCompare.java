import java.util.Scanner;
public class Q9_ToUpperCaseCompare {
    public static String customToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            result += c;
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
        String text = sc.nextLine();
        String manual = customToUpperCase(text);
        String builtin = text.toUpperCase();
        boolean result = compareStrings(manual, builtin);
        System.out.println("Manual uppercase: " + manual);
        System.out.println("Built-in uppercase: " + builtin);
        System.out.println("Are they equal? " + result);
    }
}