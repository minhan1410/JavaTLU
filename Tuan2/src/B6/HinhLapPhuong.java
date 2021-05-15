package B6;

public class HinhLapPhuong extends HinhChuNhat{
    public double h;

    public HinhLapPhuong() {
        this(0,0,0);
    }

    public HinhLapPhuong(double cd, double cr) {
        super(cd, cr);
    }

    public HinhLapPhuong(double h) {
        this(0,0,h);
    }

    public HinhLapPhuong(double cd, double cr, double h) {
        super(cd, cr);
        if(h<=0){
            this.h=0;
        }
        else{
            this.h = h;
        }
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

    public double TheTich(){
        return super.Dt()*h;
    }

    public static void main(String[] args) {
        HinhChuNhat a=new HinhChuNhat(6,7);
        System.out.println(a.Dt());

        HinhLapPhuong b=new HinhLapPhuong(6,7,8);
        System.out.println(b.TheTich());

        HinhChuNhat a1=new HinhChuNhat(-6,7);
        System.out.println(a1.Dt());

        HinhLapPhuong b1=new HinhLapPhuong(6,7,-8);
        System.out.println(b1.TheTich());
    }
}
