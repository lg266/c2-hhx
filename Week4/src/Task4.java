import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {4,0,1,0,2,3};
        int k = 3;
        System.out.println(K1(arr, k));
    }

    public static int K1(int[] a, int k) {
        Arrays.sort(a);
        return a[k-1];
    }
}