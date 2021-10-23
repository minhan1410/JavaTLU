package BenhNhan;

public class BenhAn extends BenhNhan {
    private String BenhAn;
   
    public BenhAn() {
        BenhAn = "";
    }

    public BenhAn(String benhAn) {
        BenhAn = benhAn;
    }

    public BenhAn(String name, String address, int age, String benhAn) {
        super(name, address, age);
        BenhAn = benhAn;
    }

    public String getBenhAn() {
        return BenhAn;
    }

    public void setBenhAn(String benhAn) {
        BenhAn = benhAn;
    }

    @Override
    public String toString() {
        return "BenhAn [BenhAn=" + BenhAn + "]";
    }
    
}
