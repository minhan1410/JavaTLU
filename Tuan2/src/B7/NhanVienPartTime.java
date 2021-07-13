package B7;

import java.util.Random;

public class NhanVienPartTime extends NhanVien1 {
    private int gioLV;

    public NhanVienPartTime() {
        this("", 0);
    }

    public NhanVienPartTime(String ten) {
        super(ten);
    }

    public NhanVienPartTime(int gioLV) {
        this("", gioLV);
    }

    public NhanVienPartTime(String ten, int gioLV) {
        super(ten);
        this.gioLV = gioLV;
    }

    public int getGioLV() {
        return gioLV;
    }

    public void setGioLV(int gioLV) {
        this.gioLV = gioLV;
    }

    @Override
    public int Luong() {
        return gioLV * 40;
    }

    public static void main(String[] args) {
        NhanVien1[] nv = new NhanVien1[5];
        Random random = new Random();
        int a;
        for (int i = 0; i < 5; i++) {
            a = random.nextInt(100) + 1;
            if (a % 2 != 0) {
                nv[i] = new NhanVienFullTime("An" + i);
                int ngay = random.nextInt(10+1) + 15;
                ((NhanVienFullTime) nv[i]).setNgayLV(ngay);
            } else {
                nv[i] = new NhanVienPartTime("An" + i);
                int gio = random.nextInt(120+1) + 80;
                ((NhanVienPartTime) nv[i]).setGioLV(gio);
            }
            System.out.println(nv[i].getTen() + " - " + nv[i].Luong() + "$");
        }
    }
}
