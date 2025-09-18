import java.util.Scanner;
public class UniqueCharFrequency {
    public static char[] uniqueCharacters(String s) {
        int len = s.length();
        char[] temp = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) if (s.charAt(j) == c) found = true;
            if (!found) temp[index++] = c;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }
    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] unique = uniqueCharacters(s);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] res = frequency(s);
        for (String[] row : res) System.out.println(row[0] + " " + row[1]);
    }
}