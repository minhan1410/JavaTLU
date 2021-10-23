package MonHoc;

public class MonHoc extends Gv {
    private String ma,TenMon;
    private int tiet,tin,SoBaiKt;

     public MonHoc(String gt, String TenGv, int tuoi, String ma, String tenMon, int tiet, int tin, int soBaiKt) {
        super(gt, TenGv, tuoi);
        this.ma = ma;
        TenMon = tenMon;
        this.tiet = tiet;
        this.tin = tin;
        SoBaiKt = soBaiKt;
    }

    public MonHoc(String ma, String tenMon, int tiet, int tin, int soBaiKt) {
        this.ma = ma;
        TenMon = tenMon;
        this.tiet = tiet;
        this.tin = tin;
        SoBaiKt = soBaiKt;
    }

    public MonHoc(){
        ma=TenMon="";
        tiet =tin=SoBaiKt=0;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String tenMon) {
        TenMon = tenMon;
    }

    public int getTiet() {
        return tiet;
    }

    public void setTiet(int tiet) {
        this.tiet = tiet;
    }

    public int getTin() {
        return tin;
    }

    public void setTin(int tin) {
        this.tin = tin;
    }

    public int getSoBaiKt() {
        return SoBaiKt;
    }

    public void setSoBaiKt(int soBaiKt) {
        SoBaiKt = soBaiKt;
    }

    public void Set(String gt, String TenGv, int tuoi, String ma, String tenMon, int tiet, int tin, int soBaiKt){
        super.setGt(gt);super.setTenGv(TenGv);super.setTuoi(tuoi);
        setMa(ma);setTenMon(tenMon);setTiet(tiet);setTin(tin);setSoBaiKt(soBaiKt);
    }

    @Override
    public String toString() {
        System.out.print("\n"+super.toString());
        return "Ma: "+ma+" - Ten mon: "+TenMon+" - So bai kt: "+SoBaiKt+" - Tiet: "+tiet+" - Tin: "+tin+"\n";
    }
}
