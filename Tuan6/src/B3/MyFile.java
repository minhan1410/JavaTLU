package B3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MyFile {
    public static File newFile(String addrees,String name, String str1) throws IOException {
        File file1=null;
        BufferedOutputStream bos1=null;
        FileOutputStream out1=null;

        try{
            String str=addrees+"\\"+name;
            file1=new File(str);

            out1=new FileOutputStream(file1);

            bos1=new BufferedOutputStream(out1);

            bos1.write((str1).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bos1.close();
            out1.close();
        }
        return file1;
    }

    public static File newPackage(String address,String name){
        String str=address+"\\"+name;
        File file=new File(str);

        //Nếu Package chưa tồn tại thì tạo Package
        if(!file.exists()){
            file.mkdir();
        }
        return file;
    }

    public static void copyFileVanBan(File file1,File file2) throws IOException {
        FileInputStream inputFile1 =null;
        BufferedReader  bisFile1=null;

        FileInputStream inputFile2 =null;
        BufferedReader  bisFile2=null;
        FileOutputStream  outputFile2=null;
        BufferedOutputStream bosFile2=null;

        try{
            //Đọc data file2 ra 1 chuỗi
            inputFile2=new FileInputStream(file2);
            bisFile2=new BufferedReader (new InputStreamReader(inputFile2,"UTF-8"));

            int i=0;String str2="";
            while((i=bisFile2.read())!=-1){
                str2+=(char)i;
            }

            //Đọc data file1 ra 1 chuỗi
            inputFile1=new FileInputStream(file1);
            bisFile1=new BufferedReader (new InputStreamReader(inputFile1,"UTF-8"));

            i=0;String str1="";
            while((i=bisFile1.read())!=-1){
                str1+=(char)i;
            }

            //Ghi 2 chuỗi đã lấy vào file 2
            outputFile2=new FileOutputStream(file2);
            bosFile2=new BufferedOutputStream(outputFile2);
            bosFile2.write((str2+str1).getBytes(StandardCharsets.UTF_8));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            bosFile2.close();
            outputFile2.close();
            bisFile1.close();
            inputFile1.close();
            bisFile2.close();
            inputFile2.close();
        }
    }

    public static void cutFileVanBan(File file1,File file2) throws IOException {
        copyFileVanBan(file1,file2);
        //Copy xg xoá file1
        file1.delete();
    }

    public static void moveFile(File file,File Package) throws IOException {
        //Tạo file mới cùng tên vs file muốn di chuyển cho Package
        System.out.println(getAddress(Package));
        File file2=newFile(getAddress(Package), file.getName(),"");

        if(!Package.exists()){
            System.out.println("Package chua ton tai");
        }
        else{
            cutFileVanBan(file,file2);
        }
    }

    public static String getAddress(File file){
        return file.getAbsolutePath().toString();
    }

}
