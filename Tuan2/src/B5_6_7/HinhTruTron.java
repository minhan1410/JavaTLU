package B5_6_7;

public class HinhTruTron extends HinhTron {
    private double h;

    public HinhTruTron() {
        this(0);
    }

    public HinhTruTron(double h) {
        this(0, h);
    }

    public HinhTruTron(double r, double h) {
        super(r);
        if (h > 0) {
            this.h = h;
        } else {
            this.h = 0;
        }
    }

    public double TheTich() {
        return super.Dt() * h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if(h<=0){
            this.h=0;
        }
        else{
            this.h = h;
        }
    }

    public static void main(String[] args) {
        HinhTron ht = new HinhTron(-3);
        System.out.println("S htron: " + ht.Dt());

        HinhTruTron htt = new HinhTruTron(3, -6);
        System.out.println("V httr: " + htt.TheTich());

        HinhTron ht1 = new HinhTron(3);
        System.out.println("S htron: " + ht1.Dt());

        HinhTruTron htt1 = new HinhTruTron(3, 6);
        System.out.println("V httr: " + htt1.TheTich());
    }
}
