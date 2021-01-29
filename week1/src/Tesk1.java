import java.util.Scanner;
import static java.lang.Math.pow;

public class Tesk1 {
    public static void main(String[] args) {
        double res;
        Scanner in=new Scanner(System.in);
        System.out.print("输入体重(kg):");
        int n=in.nextInt();
        System.out.print("输入身高(m):");
        double m=in.nextDouble();
        res=n/pow(m,2);
        if(res<18.5){
            System.out.println("过轻");
        }
        else if(res<25){
            System.out.println("正常");
        }
        else if(res<28){
            System.out.println("过重");
        }
        else System.out.println("肥胖");
    }
}
