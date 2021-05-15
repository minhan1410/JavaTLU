public class HinhTron implements IHinh{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public HinhTron() {
        this(0);
    }

    public HinhTron(double r) {
        this.r = r;
    }

    @Override
    public double chuVi() {
        return 2*Math.PI*r;
    }

    @Override
    public double dienTich() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public void thongTin() {
        System.out.println("Chu vi: "+chuVi()+" - Dien tich: "+dienTich());
    }
}
