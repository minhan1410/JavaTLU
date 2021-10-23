package Tuan2.Bai7;

import java.util.Random;

public class SoNgauNhien {
    private int so;
    private static int SoLgDoiTg =0;
    public SoNgauNhien() {
        Random random =new Random();
        so=random.nextInt(100)+1;
        SoLgDoiTg++;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public static int getSoLgDoiTg() {
        return SoLgDoiTg;
    }

    public static void setSoLgDoiTg(int soLgDoiTg) {
        SoLgDoiTg = soLgDoiTg;
    }
}
