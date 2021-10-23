package Tuan2.Bai8;

public class SoNgauNhien{
    private int soNgauNhien;
    private static int soLuong;

    public SoNgauNhien() {
        soNgauNhien =(int)(Math.random()*100 +1);
        soLuong ++;
    }

    public SoNgauNhien(int soNgauNhien) {
        this.soNgauNhien = soNgauNhien;
        soLuong ++;
    }

    public int getSoNgauNhien() {
        return soNgauNhien;
    }

    public void setSoNgauNhien(int soNgauNhien) {
        this.soNgauNhien = soNgauNhien;
    }

    public static int getSoLuong() {
        return soLuong;
    }

    public static void setSoLuong(int soLuong) {
        SoNgauNhien.soLuong = soLuong;
    }
}