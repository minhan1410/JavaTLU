package BenhVien.BenhNhan;


import java.util.Objects;

public class BenhNhan implements Comparable<BenhNhan>{
    private String ten,cmt,gt;
    private int ns,tuoi;

    public BenhNhan() {
        this("","","",0);
    }

    public BenhNhan(String cmt, String ten,String gt, int ns) {
        this.ten = ten;
        this.cmt = cmt;
        this.gt=gt;
        this.ns = ns;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public int getTuoi(){
       return tuoi=java.time.LocalDate.now().getYear()-ns;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    @Override
    public String toString() {
        return "CMT: "+cmt+" - Tên: "+ten+" - Giới tính: "+gt+" - Tuổi: "+getTuoi();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BenhNhan benhNhan = (BenhNhan) o;
        return cmt.equals(benhNhan.cmt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmt);
    }

    @Override
    public int compareTo(BenhNhan o) {
        if(getTuoi()==o.getTuoi()){
            return 1;
        }
        return getTuoi()>o.getTuoi() ? 1:-1;
    }
}
