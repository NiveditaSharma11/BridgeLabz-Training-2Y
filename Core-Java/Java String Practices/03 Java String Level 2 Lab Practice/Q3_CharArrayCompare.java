import java.util.Scanner;
public class Q3_CharArrayCompare {
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] manual = customToCharArray(text);
        char[] builtin = text.toCharArray();
        boolean result = compareArrays(manual, builtin);
        System.out.println("Manual array length: " + manual.length);
        System.out.println("Built-in array length: " + builtin.length);
        System.out.println("Arrays equal? " + result);
    }
}