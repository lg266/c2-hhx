import java.util.Scanner;

public class Tesk4 {
    static int v=100;
    public static void main(String[] args) {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("欢迎来到猜字游戏，请输入一个数:");
        while(true){
            a = in.nextInt();
            if (a > v) System.out.println("猜大了，再试一下吧！");
            else if (a < v) System.out.println("猜小了，再试一下吧！");
            else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
            }
        }
}
