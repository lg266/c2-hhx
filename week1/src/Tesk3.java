import java.util.Scanner;

public class Tesk3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = "";
        System.out.print("输入:");
        str=in.nextLine();
        char[] ch = str.toCharArray();
        String str2 = "";
        for (int i = ch.length - 1; i >= 0; i --) {
                str2 = str2 + ch[i];
        }
        System.out.println("输出:"+str2);
        }

}
