import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IHinh> hinh=new ArrayList<IHinh>();
        hinh.add(new HinhChuNhat(2,4));
        hinh.add(new HinhTron(3.5));

        for(IHinh i: hinh){
            i.thongTin();
        }
    }
}
