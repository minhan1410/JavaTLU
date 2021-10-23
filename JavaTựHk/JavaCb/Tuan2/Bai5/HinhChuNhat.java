package Tuan2.Bai5;

public class HinhChuNhat {
    private double cd, cr;

    public HinhChuNhat() {
        cd = cr = 0;
    }

    public HinhChuNhat(double cd, double cr) {
        if (cd < 0 || cr < 0) {
            cd = cr = 0;
        }
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public double getCr() {
        return cr;
    }

    public double SHCN() {
        return cd * cr;
    }
}
