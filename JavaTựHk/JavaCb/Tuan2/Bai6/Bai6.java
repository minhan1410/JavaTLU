package Tuan2.Bai6;

import java.util.Random;

public class Bai6 {
    public static void main(String[] args) {
        Random random = new Random();
        NhanVien a,b;int d=0;
        while(true){
            int nn = random.nextInt(100) + 1;
            if (nn % 2 == 0) {
                int ngay= random.nextInt(25)+1;
                if(ngay>=15 && ngay<=25){
                    a=new NhanVienFullTime(ngay);
                    System.out.println("Luong: "+a.Luong());d++;
                }
            }
            else{
                int gio=random.nextInt(200)+1;
                if(gio>=80 && gio<=200){
                    b= new NhanVienPartTime();
                    ((NhanVienPartTime)b).setGioLmVc(gio);
                    System.out.println("Luong: "+b.Luong());d++;
                }
            }
            if(d==5){
                break;
            }
        }
    }
}
