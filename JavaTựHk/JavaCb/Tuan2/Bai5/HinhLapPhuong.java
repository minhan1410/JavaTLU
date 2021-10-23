package Tuan2.Bai5;

public class HinhLapPhuong extends HinhChuNhat {
    private double cc;

    public HinhLapPhuong() {
        super(0, 0);
        cc = 0;
    }

    public HinhLapPhuong(double cc) {
        super(cc, cc);
        if (cc < 0) {
            cc = 0;
        }
        this.cc = cc;
    }

    public double getCc() {
        return cc;
    }

    public double VLP() {
        return Math.pow(cc, 3);
    }
}
