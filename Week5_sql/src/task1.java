import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(task01(num));
    }
    public static int task01(int num) {
        int sign;
        if(num>0)sign=1;
        else sign=-1;
        StringBuilder numSb = new StringBuilder();
        numSb.append(Math.abs(num));
        numSb.reverse();
        try {
            return Integer.parseInt(numSb.toString()) * sign;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}