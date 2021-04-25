import java.util.*;

public class Main2{
    static LinkedList<String> a=new LinkedList<String>();
    static LinkedList<String> b=new LinkedList<String>();
    static void remove(String m,String x){
        for(int i=a.size()-1;i>=0;i--) {
            if(a.get(i).equals(m)) {
                a.remove(i);
                b.remove(i);
                return;
            }
        }
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        String s="";
        while(in.hasNext()) {
            String x=in.next();
            if(x.equals("#"))break;
            char r[]=x.toLowerCase().toCharArray();
            Arrays.sort(r);
            String m=" ";
            for(char i:r)m+=i;
            m+=" ";
            if(s.contains(m)) {
                remove(m,x);
            }else {
                a.add(m);
                b.add(x);
                s=s+m;
            }
        }
        Collections.sort(b);
        for(String q:b) {
            System.out.println(q);
        }
        in.close();
    }
}