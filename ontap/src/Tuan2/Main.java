package Tuan2;

import Tuan2.Bai8.SoNgauNhien;

public class Main{
    public static void main(String[] args) {
        // NhanVien nhanVien[] =new NhanVien[5];
        // for(int i=0;i<5;i++){
        //     int a=(int)(Math.random()*100 +1);
        //     if(a%2==0){
        //         int soGio=(int) (Math.random()*120 +80); 
        //         nhanVien[i]=new NhanVienPartTime(soGio);
        //     }else{
        //         int soNgay=(int) (Math.random()*10 +15);
        //         nhanVien[i]=new NhanVienFullTime(soNgay);
        //     }
        //     System.out.println(nhanVien[i].toString()+" - " + nhanVien[i].TinhLuong());
        // }

        for(int i=1;i<=10;i++){
            SoNgauNhien soNgauNhien=new SoNgauNhien();
            System.out.println("So ngau nhien: "+soNgauNhien.getSoNgauNhien());
        }
        System.out.println("So lg so ngau nhien: "+SoNgauNhien.getSoLuong());

    }
}