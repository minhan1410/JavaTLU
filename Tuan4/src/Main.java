import tlu.khmt.A34732.*;

import java.util.*;

public class Main{
    public static void B1(){
        System.out.println("\nB1");
        DsSvHashSet ds=new DsSvHashSet();
        ds.add(new SinhVien("1","1",1));
        ds.add(new SinhVien("1","2",1));

        ds.add(new SinhVien("2","3",2));
        ds.add(new SinhVien("2","4",2));
        ds.add(new SinhVien("2","5",2));

        ds.add(new SinhVien("3","6",3));
        ds.add(new SinhVien("4","7",4));

        ds.add(new SinhVien("5","8",5));
        ds.add(new SinhVien("5","9",5));
        ds.add(new SinhVien("5","10",5));

        ds.xuat();
    }

    public static void B2(){
        System.out.println("\nB2");
        DsSvTreeSet ds=new DsSvTreeSet();
        ds.add(new SinhVien("1","1",1));
        ds.add(new SinhVien("1","2",1));

        ds.add(new SinhVien("2","3",2));
        ds.add(new SinhVien("2","4",2));
        ds.add(new SinhVien("2","5",2));

        ds.add(new SinhVien("3","6",3));
        ds.add(new SinhVien("4","7",4));

        ds.add(new SinhVien("5","8",5));
        ds.add(new SinhVien("5","9",5));
        ds.add(new SinhVien("5","10",5));

        System.out.println("Sắp xếp theo thứ tự giảm dần của điểm tốt nghiệp");
        ds.xuat();

        System.out.println("\n3 sinh viên có điểm tốt nghiệp cao nhất:");
        ArrayList<SinhVien> a=new ArrayList<SinhVien>(ds.getSetSv());
        for(int i=0;i<3;i++){
            System.out.println(a.get(i).getMsv()+" - "+a.get(i).getTen()+" - "+a.get(i).getDiem());
        }
    }

    public static void B3(){
        System.out.println("\nB3");
        Scanner scanner=new Scanner(System.in);
        System.out.print("s= ");String s=scanner.nextLine();
        scanner.close();

        String []str=s.split(" ");
        Map<String,Integer> map=new LinkedHashMap<String,Integer>();

        for(int i=0;i<str.length;i++){
            int dem=0;
            for(int j=0;j<str.length;j++){
                if(str[i].equals(str[j])){
                    dem++;
                }
            }
            map.put(str[i],dem);
        }

        map.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });

        System.out.println("\n3 từ có số lượng xuất hiện nhiều nhất:");
        List<String> list=new ArrayList<String>(map.keySet());
        int dem=0;
        while(dem<3){
            int max= 0;String m="";
            for(int i=0;i<list.size();i++){
                if(max<map.get(list.get(i))){
                    max=map.get(list.get(i));
                    m=list.get(i);
                }
            }
            System.out.println(m);
            list.remove(list.indexOf(m));
            dem++;
        }
    }

    public static void B4(){
        System.out.println("\nB4");
        DsPoint<Double> ds=new DsPoint<Double>();
        ds.add(new Point<Double>(-1.0,-2.0));
        ds.add(new Point<Double>(-2.0,-4.0));
        ds.add(new Point<Double>(0.0,0.0));
        ds.add(new Point<Double>(0.0,0.0));

        ds.add(new Point<Double>(1.0,1.0));
        ds.add(new Point<Double>(1.0,1.0));
        ds.add(new Point<Double>(1.0,1.0));
        ds.add(new Point<Double>(1.0,2.0));

        ds.add(new Point<Double>(1.5,1.5));
        ds.add(new Point<Double>(2.0,2.0));
        ds.add(new Point<Double>(2.0,3.0));
        ds.add(new Point<Double>(2.0,2.0));
        ds.add(new Point<Double>(2.0,3.0));


        ds.Xuat();System.out.println();
        ds.kt3DThangHang();
    }

    public static void B5(){
        System.out.println("\nB5");
        DsNhanVien ds=new DsNhanVien();
        ds.add(new NhanVien(1,"1",1));
        ds.add(new NhanVien(2,"2",2));
        ds.add(new NhanVien(1,"1",1));
        ds.add(new NhanVien(3,"3",3));
        ds.add(new NhanVien(2,"2",2));
        ds.add(new NhanVien(4,"4",4));
        ds.add(new NhanVien(3,"3",3));
        ds.add(new NhanVien(5,"5",5));
        ds.add(new NhanVien(5,"5",5));
        ds.add(new NhanVien(4,"4",4));

        ds.xuat();
    }

    public static void main(String[] args) {
        B1();
        B2();
        B3();//1 2 3 Nguyen Nguyen An Nguyen An Minh 1
        B4();
        B5();
    }
}
