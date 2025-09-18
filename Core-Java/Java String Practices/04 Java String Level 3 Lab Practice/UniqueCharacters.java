import java.util.Scanner;
public class UniqueCharacters {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static char[] findUnique(String s) {
        int len = getLength(s);
        char[] unique = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) unique[index++] = c;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = unique[i];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] unique = findUnique(s);
        for (char c : unique) System.out.print(c + " ");
    }
}