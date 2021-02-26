public class Task3 {
    public static void main(String[] args) {
        String strs = "233hello15aop999 ";
        String[] res=new String[10];
        int count=0;
        int result=0;
        int n,m;
        n=strs.length();
        for(int i=0;i<n;i++){
            if(Character.isDigit(strs.charAt(i))){
                count++;
            }
            else if(count!=0){
                m=i-count;
                res[result]=strs.substring(m,i);
                result++;
                count=0;
            }
        }
        System.out.printf("输出:[%s,%s,%s]",res[0],res[1],res[2]);
    }
}