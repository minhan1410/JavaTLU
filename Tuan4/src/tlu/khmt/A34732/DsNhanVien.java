package tlu.khmt.A34732;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DsNhanVien {
    private Set<NhanVien> set;

    public DsNhanVien() {
        set=new HashSet<NhanVien>();
    }

    public void add(NhanVien v){
        if(!set.contains(v)){
            set.add(v);
        }
    }

    public void xuat(){
        List<NhanVien> l=new ArrayList<NhanVien>(set);

        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i).toString()+"Luong: "+l.get(i).getLg()*15);
        }
    }
}
