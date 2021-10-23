package CanBo;

public class Staff extends Officer {
    private String CongViec;

    public Staff(String congViec) {
        CongViec = congViec;
    }

    public Staff(String name, String sex, String address, int age, String congViec) {
        super(name, sex, address, age);
        CongViec = congViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+" -- Staff [CongViec=" + CongViec + "]";
    }
}
