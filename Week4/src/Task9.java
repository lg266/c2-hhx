import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException {
        String result="";
        String thisline=null;
        File f=new File("C:/csatest/demo.txt");
        File f1=new File("C:/csatest2/demo2.txt");
        try {
            BufferedReader b=new BufferedReader(new FileReader(f));
            while((thisline=b.readLine())!=null)
            {
                result+=thisline+"\n";
            }
            b.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        BufferedWriter b1=new BufferedWriter(new FileWriter(f1));
        b1.write(result);
        b1.close();
    }
}
