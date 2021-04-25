import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Ticket
 * @Description TODO
 * @Author bunny
 * @Date 2021/4/19 14:04
 * @Version 1.0
 **/
public class Ticket {
    public static void main(String[] args) {
        Integer a = new Integer(200);
        int b=200;
        Integer c=200;
        Integer d=200;

        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println(c==d);
    }
}