import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("输入:helloworld\n输出:");
        System.out.println(charcount("helloworld"));
    }

    public static String charcount(String str) {
        char[] chs = str.toCharArray();
        TreeMap<Character, Integer> tm = new TreeMap<>();
        int count = 0;
        for (int x = 0; x < chs.length; x++) {
            if (!(chs[x] >= 'a' && chs[x] <= 'z') || (chs[x] >= 'A' && chs[x] <= 'Z'))
                continue;
            Integer value = tm.get(chs[x]);
            if (value != null)
                count = value;
            count++;
            tm.put(chs[x], count);
            count = 0;
        }
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<Character, Integer>> me = tm.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = me.iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> m = it.next();
            Character ch = m.getKey();
            Integer in = m.getValue();
            sb.append(ch + ":" + in + "\n");
        }
        return sb.toString();

    }
}