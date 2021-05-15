package B3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> nv=new ArrayList<NhanVien>();
        Random random=new Random();
        int a=0;int h=0;int g=0;
        for(int i=0;i<=20;i++){
            a=random.nextInt(100)+1;
            if(a%2==0){
                h=random.nextInt(120+1)+80;
                System.out.print("Gio: "+h+" - ");
                nv.add(new NhanVienPartTime("NhanVienPartTime "+i,h));
            }
            else{
                g=random.nextInt(11)+15;
                System.out.print("Ngay: "+g+" - ");
                nv.add(new NhanVienFullTime("NhanVienFullTime "+i,g));
            }
            nv.get(i).tinhLg();
            System.out.println(nv.get(i).getTen()+" - Lg: "+nv.get(i).getLg()+"$");
        }


    }
}
