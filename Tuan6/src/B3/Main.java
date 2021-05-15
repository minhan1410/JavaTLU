package B3;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String addsres="C:\\Users\\admin\\Desktop\\BtJava\\Tuan6\\src\\B3";

        File file1= MyFile.newFile(addsres,"file1.txt"," - Nguyễn Minh An");
        File file2= MyFile.newFile(addsres,"file2.txt","A34732");

//        MyFile.copyFileVanBan(file1,file2);
//        MyFile.cutFileVanBan(file1,file2);

        File Package=MyFile.newPackage(addsres,"hihi");

        File file3= new File("C:\\Users\\admin\\Desktop\\BtJava\\Tuan6\\src\\B3\\ảnh.jpg");
        MyFile.moveFile(file3,Package);
    }
}
