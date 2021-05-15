package src;

import java.util.Objects;

public class NhanVien{
    private int NamSinh,tuoi;
    private long TongThuNhap;
    private String ten,id;

    public NhanVien() {
        this("","",0,0);
    }

    public NhanVien(String id,String ten,int NamSinh,long tongThuNhap) {
        this.NamSinh = NamSinh;
        this.TongThuNhap = tongThuNhap;
        this.ten = ten;
        this.id = id;
    }

    public int getTuoi() {
        return tuoi= java.time.LocalDate.now().getYear()-NamSinh;
    }

    public void setTuoi(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public long getTongThuNhap() {
        return TongThuNhap;
    }

    public void setTongThuNhap(long tongThuNhap) {
        TongThuNhap = tongThuNhap;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id+" "+ten+" "+getTuoi()+" "+TongThuNhap+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanVien nhanVien = (NhanVien) o;
        return id.equals(nhanVien.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
