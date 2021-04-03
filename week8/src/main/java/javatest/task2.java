package javatest;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String a;
        Scanner in= new Scanner(System.in);
        a=in.nextLine();
        System.out.println(validPalindrome(a));
    }
        public static boolean validPalindrome(String s) {
            char[] ch=s.toCharArray();
            for(int i=0,j=ch.length-1;i<j;i++,j--){
                if(ch[i]!=ch[j]){
                    return isPalindrome(ch,i+1,j)||isPalindrome(ch,i,j-1);
                }
            }
            return true;
        }
        public static boolean isPalindrome(char[] s,int i,int j){
            while(i<j){
                if(s[i]!=s[j]){
                    return false;
                }
                i++;j--;
            }
            return true;
        }
}