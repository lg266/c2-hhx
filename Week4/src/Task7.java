import java.util.*;

public class Task7 {
    static List<List<String>> tes1(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String tes = strs[i];
            char[] arr = tes.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                map.get(key).add(tes);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main (String[]args){
        String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(tes1(a));

    }
}