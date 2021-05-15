package B2;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) throws IOException {
        FileOutputStream out=null;
        BufferedOutputStream data=null;
        try{
            out=new FileOutputStream("Fibonacci.txt");
            data=new BufferedOutputStream(out);
            for(int i=0;i<=38;i++){
                data.write((Fibonacci(i)+"\n").getBytes(StandardCharsets.UTF_8));
            }
        }catch (IOException e) {
            System.out.println("loi"+e);
        } finally {
            data.close();
            out.close();
        }


        FileInputStream in=new FileInputStream("C:\\Users\\admin\\Desktop\\BtJava\\Tuan6\\src\\B2\\Fibonacci.txt");
        InputStreamReader bin = new InputStreamReader(in, "UTF-8");
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
            if((char)i==' '){
                System.out.println();
            }
        }
    }
}
