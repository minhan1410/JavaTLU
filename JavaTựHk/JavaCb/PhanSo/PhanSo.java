package PhanSo;

public class PhanSo {
    private int tu,mau;

    public PhanSo() {
        tu=mau=1;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public PhanSo Cong(PhanSo b){
        PhanSo c=new PhanSo((tu*b.mau + mau*b.tu)/USCLN(tu*b.mau + mau*b.tu, mau*b.mau),(mau*b.mau)/USCLN(tu*b.mau + mau*b.tu, mau*b.mau));
        return c;
    }

    public PhanSo Tru(PhanSo b){
        PhanSo c=new PhanSo((tu*b.mau - mau*b.tu)/USCLN(tu*b.mau - mau*b.tu, mau*b.mau),(mau*b.mau)/USCLN(tu*b.mau - mau*b.tu, mau*b.mau));
        return c;
    }

    public PhanSo Nhan(PhanSo b){
        PhanSo c=new PhanSo((tu*b.tu)/USCLN(tu*b.tu,mau*b.mau),(mau*b.mau)/USCLN(tu*b.tu,mau*b.mau));
        return c;
    }

    public PhanSo Chia(PhanSo b){
        PhanSo c=new PhanSo((tu*b.mau)/USCLN((tu*b.mau),mau*b.tu),(mau*b.tu)/USCLN((tu*b.mau),mau*b.tu));
        return c;
    }

    public void Xuat(){
        System.out.printf("%d/%d\n",tu,mau);
    }

    @Override
    public String toString() {
        return "" + mau + "/" + tu;
    }
}
