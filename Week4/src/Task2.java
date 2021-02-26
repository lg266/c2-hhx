public class Task2 {
    static int searchIndex(String s) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                    return i;
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(searchIndex(s));
    }
}
