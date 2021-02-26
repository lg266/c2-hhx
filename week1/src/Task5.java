import java.util.Scanner;

import static java.lang.Math.pow;

class Circle{
    final double pi=3.14;
    double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    void getArea(){
        System.out.println("the area is "+pow(radius,2)*pi);
    }
    void getPerimeter(){
        System.out.println("the perimeter is "+2*pi*radius);
    }
}

public class Tesk5 {
    public static void main(String[] args) {
        double n;
        Circle yuan=new Circle();
        Scanner in =new Scanner(System.in);
        System.out.print("输入:");
        n=in.nextDouble();
        yuan.setRadius(3);
        yuan.getArea();
        yuan.getPerimeter();
    }
}
