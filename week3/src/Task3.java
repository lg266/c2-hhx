import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入字符串：");
            String s = scanner.nextLine();
            String[] split = s.split("");
            LinkedHashSet<String> strings = new LinkedHashSet<>();
            for (int i = 0; i < split.length; i++) {
                strings.add(split[i]);
            }
            System.out.println(strings);
        }
}