import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>(1600);
        num.add(1);
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for (int i = 1; i < 1501; i++) {
            num.add(getMinimum(num.get(index2) * 2, num.get(index3) * 3, num.get(index5) * 5));
            while (num.get(index2) * 2 <= num.get(i))
                index2++;
            while (num.get(index3) * 3 <= num.get(i))
                index3++;
            while (num.get(index5) * 5 <= num.get(i))
                index5++;
        }
        System.out.printf("The 1500'th ugly number is %d.\n",num.get(1499));
    }

    static int getMinimum(int a, int b, int c) {
        if (a > b)
            a = b;
        if (a > c)
            a = c;
        return a;
    }
}