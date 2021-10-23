package BenhNhan;
import java.util.ArrayList;

public class QlPDT {
    private ArrayList<BenhAn> qlPdt;
    
    public QlPDT(){
        qlPdt = new ArrayList<BenhAn>();
    }

    public void Add(BenhAn v){
        qlPdt.add(v);
    }

    public void Show(){
        for(BenhAn i: qlPdt){
            System.out.println(i);
        }
    }

    public void Sua(BenhAn v,BenhAn a){
        qlPdt.set(qlPdt.indexOf(v), a);
    }

    public int TkVt(BenhAn v){
        return qlPdt.indexOf(v);
    }

    public BenhAn TkBn(BenhAn v){
        return qlPdt.get(TkVt(v));
    }
}
