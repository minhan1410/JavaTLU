package B4;

import java.io.File;
import java.util.Scanner;

public class MyDir {
    public static void showChild(File file){
        //Nếu là package -> true, file-> false
        if(file.isDirectory()){
            File[] child= file.listFiles();
            for(File i: child){
                System.out.println(i.lastModified()+" - "+i.getAbsoluteFile()+" - "+i.length());
            }
        }
        else{
            System.out.println(file.getAbsoluteFile());
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String cd;
        while(true){
            System.out.print("cd: ");cd=scanner.next();
            if(cd.equals("0")){
                break;
            }
            File a=new File(cd);
            System.out.println("List:");
            showChild(a);
        }
    }
}
