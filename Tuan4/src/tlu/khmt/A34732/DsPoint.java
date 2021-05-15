package tlu.khmt.A34732;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class DsPoint<T> {
    private Set<Point<? extends Number>> set;

    public DsPoint() {
        set=new HashSet<Point<? extends Number>>();
    }

    public void add(Point<? extends Number> v){
        if(!set.contains(v)){
            set.add(v);
        }
    }

    public void Xuat(){
        for(Point<? extends Number> i: set){
            System.out.println("( "+i.getX()+", "+i.getY()+" )");
        }
    }

    public void kt3DThangHang(){
        List<Point<? extends Number>> list=new ArrayList<Point<? extends Number>>();
        list.addAll(set);int dem=0;

        for(int i=0;i< list.size();i++){
            for(int j=i+1;j<list.size();j++){
                for(int k=j+1;k<list.size();k++){
                    double a=( (Double)(list.get(i).getY()) - (Double) (list.get(j).getY()) )*( (Double)(list.get(i).getX()) - (Double)(list.get(k).getX()) );
                    double b=( (Double)(list.get(i).getY()) -(Double)(list.get(k).getY()) )*( (Double)(list.get(i).getX()) - (Double)(list.get(j).getX()) );
//                    if( (list.get(i).getY()-list.get(j).getY())*(list.get(i).getX()-list.get(k).getX()) == (list.get(i).getY()-list.get(k).getY())*( list.get(i).getX()-list.get(j).getX()) ){
//                        System.out.println();
//                    }
                    if(a==b){
                        dem++;
                        System.out.println("{ "+list.get(i).xuat() +" + "+list.get(j).xuat()+" + "+list.get(k).xuat()+" }");
                    }
                }
            }
        }
        System.out.println("\n==> Co "+dem+" diem thanh hang.\n");
    }
}
