import java.util.*;

public class hasmap {
    public static void main(String[] args) {
        String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static  List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap(strs.length);

        for (String str : strs) {
            char[] bin = str.toCharArray();
            Arrays.sort(bin);
            map.computeIfAbsent(String.valueOf(bin), unused -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}