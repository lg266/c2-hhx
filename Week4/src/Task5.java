import java.util.Arrays;

public class Task5 {
    static int majorjudge(int[] nums) {
            Arrays.sort(nums);
        int count = 0;
        int major = -1;
            if(nums.length ==1)

        {
            return nums[0];
        }
            for(
        int i = 0;
        i<nums.length;i++)

        {
            if (major == -1) {
                major = nums[i];
                count++;
            } else {
                if (nums[i] == major) {
                    count++;
                    if (count >= nums.length / 2 + 1) {
                        return major;
                    }
                } else {
                    count = 1;
                    major = nums[i];
                }
            }
        }
            return -1;
    }

    public static void main(String[] args) {
        int[] a={1,2,5,9,5,9,5,5,5};
        System.out.println(majorjudge(a));
    }
}