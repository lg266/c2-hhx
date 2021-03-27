package com.Task;

import java.util.HashMap;

public class Task3 {

    public static void main(String[] args) {
        int[] a={1,2,4,2};
        System.out.println(Unique(a));
    }

    public static int Unique(int[] nums) {
            HashMap<Integer, Integer> mapper = new HashMap<>();
            int res = 0;
            for (int num : nums) {
                if (!mapper.containsKey(num)) {
                    res += num;
                    mapper.put(num, 1);
                } else if (mapper.containsKey(num) && mapper.get(num) == 1) {
                    res -= num;
                    mapper.put(num, mapper.get(num) + 1);
                }
            }
            return res;
    }
}
