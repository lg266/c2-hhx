package algorithm;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        System.out.println(lastRemaining(a,b));
    }
    static int lastRemaining(int n, int m) {
            int ans = 0;
            // 最后一轮剩下2个人，所以从2开始反推
            for (int i = 2; i <= n; i++) {
                ans = (ans + m) % i;
            }
            return ans;
    }
}
