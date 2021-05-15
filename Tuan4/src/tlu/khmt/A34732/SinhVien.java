package tlu.khmt.A34732;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
    private String msv,ten;
    private double diem;

    public SinhVien() {
        this("","",0);
    }

    public SinhVien(String msv, String ten, double diem) {
        this.msv = msv;
        this.ten = ten;
        this.diem = diem;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return msv.equals(sinhVien.msv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msv);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(diem>o.getDiem()){
            return -1;
        }
        if(diem==o.getDiem()){
            return 0;
        }
        return 1;
    }
}
