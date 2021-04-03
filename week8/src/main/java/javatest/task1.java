package javatest;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        double a;
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        System.out.println(printBin(a));
    }
    public static String printBin(double num) {
            StringBuffer sb = new StringBuffer();
            sb.append("0.");
            while(num != 0) {
                num *= 2;
                if(num >= 1) {
                    sb.append(1);
                    num -= 1;
                }else {
                    sb.append(0);
                }
                if(sb.length() > 32)
                    return "ERROR";
            }
            return sb.toString();
    }
}