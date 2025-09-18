import java.util.Scanner;
public class Q6_IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println(text.substring(3, 1));
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(3, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception generated: " + e);
        }
        handleException(text);
    }
}