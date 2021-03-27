package com.Task;

import java.util.Stack;

public class Task2 {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] a1={4,5,3,2,1};
        System.out.println(stack1(a,a1));
    }

    public static boolean stack1(int[] pushed, int[] popped) {
        int len = pushed.length;
        Stack<Integer> stack = new Stack();

        int i = 0;
        for (int x: pushed) {
            stack.push(x);
            while (!stack.isEmpty() && i < len && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }

        return i == len;
    }
}