import java.util.ArrayList;
import java.util.List;

public class java_1 {
    static List<Integer> circle(int[][] matrix) {
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1;
        List<Integer> list = new ArrayList<>();
        int toal = matrix.length * matrix[0].length;
        int num = 1;
        while (num <= toal) {
            for (int i = l; i <= r && num <= toal  ; i++) {
                list.add(matrix[t][i]);
                num++;
            }
            t++;
            for (int i = t; i <= b && num <= toal ; i++) {
                list.add(matrix[i][r]);
                num++;
            }
            r--;
            for (int i = r; i >= l && num <= toal ; i--) {
                list.add(matrix[b][i]);
                num++;
            }
            b--;
            for (int i = b; i >= t && num <= toal ; i--) {
                list.add(matrix[i][l]);
                num++;
            }
            l++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(circle(matrix));
    }
}


