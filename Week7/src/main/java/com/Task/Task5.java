package com.Task;

public class Task5 {
    public static void main(String[] args) {
        int[] a={1,1,0,1,1,1};
        System.out.println(maxone(a));
    }

    public static int maxone(int[] nums) {
            int maxCount = 0, count = 0;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 1) {
                    count++;
                } else {
                    maxCount = Math.max(maxCount, count);
                    count = 0;
                }
            }
            maxCount = Math.max(maxCount, count);
            return maxCount;
    }
}
