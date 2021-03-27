package com.Task;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Task4 {

    public static void main(String[] args) {
        int[] a={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxWindow(a,3)));
    }

    public static int[] maxWindow(int[] nums, int k) {
            if(nums.length == 0 || k == 0) return new int[0];
            Deque<Integer> deque = new LinkedList<>();
            int[] res = new int[nums.length - k + 1];
            // 未形成窗口
            for(int i = 0; i < k; i++) {
                while(!deque.isEmpty() && deque.peekLast() < nums[i])
                    deque.removeLast();
                deque.addLast(nums[i]);
            }
            res[0] = deque.peekFirst();
            // 形成窗口后
            for(int i = k; i < nums.length; i++) {
                if(deque.peekFirst() == nums[i - k])
                    deque.removeFirst();
                while(!deque.isEmpty() && deque.peekLast() < nums[i])
                    deque.removeLast();
                deque.addLast(nums[i]);
                res[i - k + 1] = deque.peekFirst();
            }
            return res;
    }
}