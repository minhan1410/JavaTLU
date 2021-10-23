package MonHoc;

public class Gv {
    private String gt,TenGv;
    private int tuoi;

    public Gv() {
        tuoi=1;gt=TenGv="";
    }

    public Gv(String gt, String TenGv, int tuoi) {
        this.gt = gt;
        this.TenGv = TenGv;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Ten Gv: "+TenGv+" - Tuoi: "+tuoi+" - Gt: "+gt+"\n";
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getTenGv() {
        return TenGv;
    }

    public void setTenGv(String tenGv) {
        TenGv = tenGv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
