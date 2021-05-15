package B5_6_7;

public class HinhTron {
    private double r;

    public HinhTron() {
        this(0);
    }

    public HinhTron(double r) {
        if (r <= 0) {
            this.r = 0;
        } else {
            this.r = r;
        }
    }

    public double Dt() {
        return Math.PI * r * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r <= 0) {
            this.r = 0;
        } else {
            this.r = r;
        }
    }
}
