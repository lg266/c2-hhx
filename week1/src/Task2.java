import static java.lang.Math.pow;

public class Task2 {
    public static void main(String[] args) {
        int i,n;
        n=0;
        for(i=2;i<1000;i++){
            if(i==(pow(i%10,3)+pow(i/10%10,3)+pow(i/100%10,3))) {
                System.out.println(i);
                n++;
            }
        }
        System.out.println(n);
    }
}
