import java.util.Scanner;

class fushu{
    private int shibu1;
    private int xubu1;
    private int shibu2;
    private int xubu2;

    public void setShibu1(int shibu1) {
        this.shibu1 = shibu1;
    }

    public void setXubu1(int xubu1) {
        this.xubu1 = xubu1;
    }

    public void setShibu2(int shibu2) {
        this.shibu2 = shibu2;
    }

    public void setXubu2(int xubu2) {
        this.xubu2 = xubu2;
    }

    void add(){
        System.out.format("两复数相加的结果为：%d+%di\n",shibu1+shibu2,xubu1+xubu2);
    }
    void reduce(){
        System.out.format("两复数相减的结果为：%d+%di\n",shibu1-shibu2,xubu1-xubu2);
    }
    void multiply(){
        System.out.format("两复数相乘的结果为：%d+%di\n",shibu1*shibu2-xubu1*xubu2,xubu1*shibu2+shibu1*xubu2);
    }
}

public class Task7 {
    public static void main(String[] args) {
        int n;
        fushu fushu1=new fushu();
        Scanner in =new Scanner(System.in);
        System.out.print("输入:");
        n=in.nextInt();
        fushu1.setShibu1(n);
        n=in.nextInt();
        fushu1.setXubu1(n);
        n=in.nextInt();
        fushu1.setShibu2(n);
        n=in.nextInt();
        fushu1.setXubu2(n);
        System.out.println("输出:");
        fushu1.add();
        fushu1.reduce();
        fushu1.multiply();
    }
}
