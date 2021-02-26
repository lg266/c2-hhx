import java.util.Scanner;

public class Task1 {
    static int tas1(String string, String pattern) {
        int i = 0;
        int j = 0;
        char[] ch1 = string.toCharArray();
        char[] ch2 = pattern.toCharArray();
        while (i < string.length() && j < pattern.length()) {
            if (ch1[i] == ch2[j]) {
                i++;
                j++;
            } else {
                i=i-j+1;
                j=0;
            }
        }
        if (j == pattern.length()) {
            return i-j;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String pattern = in.nextLine();
        System.out.println(tas1(string, pattern));
    }
}