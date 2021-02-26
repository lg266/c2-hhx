class TCPException extends Exception{
    public TCPException(String a){
        super(a);
    }
}

public class Tesk5{
    public static void main(String[] args) throws Exception {
        try {
            int a = 3 / 0;
            System.out.println("因为catch处理后不会返回，所以不会执行这行代码");

        } catch (Exception e) {
            throw new TCPException("发生了除零错误!");
        }
    }
}