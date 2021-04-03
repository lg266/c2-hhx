package javatest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class task3 {
    public static void main(String[] args) {
        String[] ws={"cat","banana","dog","nana","walk","walker","dogwalker"};
        System.out.println(longestWord(ws));
    }
        public static String longestWord(String[] words) {
            Arrays.sort(words,(o1, o2)->{
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                else{
                    return Integer.compare(o2.length(),o1.length());
                }
            });

            Set<String> set = new HashSet<>(Arrays.asList(words));
            for(String word : words){
                set.remove(word);
                if(find(set,word))
                    return word;
            }
            return "";
        }

        public static boolean find(Set<String> set, String word){
            if(word.length() == 0)
                return true;
            for(int i = 0; i < word.length(); i++){
                if(set.contains(word.substring(0,i+1)) && find(set,word.substring(i+1)))
                    return true;
            }
            return false;
        }
}
