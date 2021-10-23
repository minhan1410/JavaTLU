package sample;
public class Tuyen {
    private static int ma=1000000;
    private double kc;
    private int diemDung;

    public Tuyen() {
        this(0,0);
    }

    public Tuyen(double kc, int diemDung) {
        this.kc = kc;
        this.diemDung = diemDung;
    }

    public static int getMa() {
        return ma;
    }

    public static void setMa(int ma) {
        Tuyen.ma = ma;
    }

    public double getKc() {
        return kc;
    }

    public void setKc(double kc) {
        this.kc = kc;
    }

    public int getDiemDung() {
        return diemDung;
    }

    public void setDiemDung(int diemDung) {
        this.diemDung = diemDung;
    }
}
