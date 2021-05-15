package vd;

import java.util.*;

public class DanhSachSinhVien {
    private Set<SinhVien> listSinhVien;

    public DanhSachSinhVien() {
        listSinhVien=new HashSet<SinhVien>();
    }

    public void add(SinhVien v){
        if(!listSinhVien.contains(v)){
            listSinhVien.add(v);
        }
    }

    public void show() {

        for (SinhVien sv : listSinhVien) {
            System.out.println("Ma SV: " + sv.getMa() + " co ten la " + sv.getTen() +
                    " va co diem la " + sv.getDiem());
        }
    }


    public static void main(String[] args) {
        DanhSachSinhVien danhSach = new DanhSachSinhVien();

        SinhVien sv1 = new SinhVien("A88888","Nguyen Van Hai", 9.2);
        SinhVien sv2 = new SinhVien("A88888","Tran Thu Ngan", 9.5);
        SinhVien sv3 = new SinhVien("A76543", "Phan Quoc Dat", 9.5);
        SinhVien sv4 = new SinhVien("A88888", "Le Hai Anh", 6.5);
        SinhVien sv5 = new SinhVien("A88888", "Chu Thong", 7.9);
        SinhVien sv6 = new SinhVien("A89898","dgsdfgdfg", 99.9);

        danhSach.add(sv1);
        danhSach.add(sv2);
        danhSach.add(sv3);
        danhSach.add(sv4);
        danhSach.add(sv5);
        danhSach.add(sv6);

        danhSach.show();

        System.out.println("--------------------------------------------------------------");

        /*danhSach.remove("A88888");
        danhSach.show();

        System.out.println("--------------------------------------------------------------");

        SinhVien sv6 = new SinhVien("A12345", "Dao Thi Lan", 8.8);
        danhSach.edit(sv6);

        danhSach.show();*/
    }
}
