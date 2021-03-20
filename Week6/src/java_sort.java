import java.util.Arrays;

public class java_sort {
    public static void maopao(int[] arra){
        for (int i = 0; i < arra.length - 1; i++) {
            for (int j = 0; j < arra.length - i - 1; j++) {
                if (arra[j] > arra[j + 1]) {
                    int temp = arra[j];
                    arra[j] = arra[j + 1];
                    arra[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arra));
    }
    public static void charu(int[] arra){
        int i,j,t = 0;
        for ( i = 1; i < arra.length; i++) {
            t = arra[i];
            j = i - 1;
            while (j >= 0 && t < arra[j]){
                arra[j+1] = arra[j];
                j--;
            }
            arra[j+1] = t;
        }
        for (int q = 0; q < arra.length; q++) {
            System.out.printf(arra[q]+" ");
        }
    }
    public static void fast(int[] arra, int left, int right){
        int f, t;
        int rtemp, ltemp;

        ltemp = left;
        rtemp = right;
        f = arra[(left + right) / 2];
        while (ltemp < rtemp) {
            while (arra[ltemp] < f) {
                ++ltemp;
            }
            while (arra[rtemp] > f) {
                --rtemp;
            }
            if (ltemp <= rtemp) {
                t = arra[ltemp];
                arra[ltemp] = arra[rtemp];
                arra[rtemp] = t;
                --rtemp;
                ++ltemp;
            }
        }
        if (ltemp == rtemp) {
            ltemp++;
        }
        if (left < rtemp) {
            fast(arra, left, ltemp - 1);
        }
        if (ltemp < right) {
            fast(arra, rtemp + 1, right);
        }

    }
    public static void dui(int[] arra, int pos, int len) {
        int temp;
        int child;
        for (temp = arra[pos]; 2 * pos + 1 < len; pos = child) {
            child = 2 * pos + 1;
            if (child + 1 < len && arra[child] < arra[child + 1]) {
                child++;
            }
            if (arra[child] > temp) {
                arra[pos] = arra[child];
            } else {
                break;
            }
        }
        arra[pos] = temp;
    }
    public static void mergeSort(int[] arra,int l,int r) {
        if (l<r) {
            int q = (l+r)/2;
            mergeSort(arra,l,q);
            mergeSort(arra,q+1,r);
            merge(arra,l,q,r);
        }
    }
    public static void merge(int[] arra, int l, int q, int r) {
        final int n1 = q-l+1;
        final int n2 = r-q;
        final int[] left = new int[n1+1];
        final int[] right = new int[n2+1];
        for (int i = 0; i < n1; i++) {
            left[i] = arra[l+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arra[q+1+i];
        }
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        int i = 0,j = 0;
        for (int k = l; k <= r; k++) {
            if (left[i]<=right[j]) {
                arra[k] = left[i];
                i = i+1;
            } else {
                arra[k] = right[j];
                j = j+1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arra = { 1, 9, 6, 8, 5 };
        maopao(arra);
        charu(arra);
        System.out.println();
        fast(arra,0,4);
        System.out.println(Arrays.toString(arra));
        int[] arra2={98,25,1,6,56,71,22,7};
        mergeSort(arra2,0,arra2.length-1);
        System.out.println(Arrays.toString(arra2));
        int[] arra1 = { 1, 9, 6,20, 8, 5,66,88 };
        int i;
        int len = arra1.length;
        for (i = len / 2 - 1; i >= 0; i--) {
            dui(arra1, i, len);
        }
        for (i = len - 1; i >= 0; i--) {
            int temp = arra1[0];
            arra1[0] = arra1[i];
            arra1[i] = temp;
            dui(arra1, 0, i);
        }
        System.out.println(Arrays.toString(arra1));

    }

}

