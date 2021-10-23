package Tuan2.Bai5;

public class Bai5 {
    public static void main(String[] args) {
        HinhChuNhat HLP1 = new HinhLapPhuong(3);
        HinhChuNhat HCN = new HinhChuNhat(4, 6);
        HinhLapPhuong HLP2 = new HinhLapPhuong(7);
        System.out.println(((HinhLapPhuong) HLP1).VLP());
        System.out.println(HLP2.VLP());
    }
}
