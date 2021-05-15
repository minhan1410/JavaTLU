public class HinhChuNhat implements IHinh{
    private double cd,cr;
    @Override
    public double chuVi() {
        return (cd+cr)*2;
    }

    @Override
    public double dienTich() {
        return cd*cr;
    }

    @Override
    public void thongTin() {
        System.out.println("Chu vi: "+chuVi()+" - Dien tich: "+dienTich());
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public HinhChuNhat() {
        this(0,0);
    }

    public HinhChuNhat(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }
}
