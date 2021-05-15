package B1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream input= null;
        BufferedInputStream binput=null;

        try{
            input=new FileInputStream("C:\\Users\\admin\\Desktop\\BtJava\\Tuan6\\src\\B1\\data.txt");
            binput=new BufferedInputStream(input);

            int i=0,dem=0;
            while((i=binput.read())!=-1){
                if((char)i=='.'){
                    dem++;
                }
            }
            System.out.println("Dem: "+dem);

        } catch (FileNotFoundException e) {
            System.out.println("loi");
            e.printStackTrace();
        }finally {
            binput.close();
            input.close();
        }

//        FileOutputStream out=new FileOutputStream("data.txt");
//        out.write(("Về tiến độ tiêm ngừa Covid-19 Bộ trưởng Y tế Nguyễn Thanh Long cho biết việc triển khai sẽ rất thận trọng. Những mũi tiêm đầu tiên được dành cho người trực tiếp làm công tác phòng chống dịch, giảm thiểu yếu tố nguy cơ lây nhiễm với đối tượng này. Dự kiến ngày 8/3, Việt Nam sẽ bắt đầu những mũi tiêm đầu tiên ở Hải Dương, BV Bệnh Nhiệt đới Trung ương và Bệnh viện Bệnh Nhiệt đới TP Hồ Chí Minh. Khi số lượng vắc xin được cung ứng tăng lên sẽ tiếp tục triển khai tiêm diện rộng, tiến tới tiêm toàn dân trong năm 2021.").getBytes(StandardCharsets.UTF_8));
    }
}
