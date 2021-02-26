import java.io.*;

public class Task8 {
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
            int index = 0;
            int count = 0;
            String Str = "2021";
            int len = Str.length();
            while ((index=result.indexOf(Str, index)) != -1) {
                index += len;
                count++;
            }
            System.out.println(count);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
