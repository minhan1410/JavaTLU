package B8;

import B4.Queue;

import java.util.ArrayList;

public class Main {
    public static void nhiPhan(int n){
        Queue<Integer> queue=new Queue<>();
        ArrayList<Integer> a=new ArrayList<Integer>();

        while(n>0){
            a.add(n%2);n/=2;
        }
        for(int i=a.size()-1;i>=0;i--){
            queue.add(a.get(i));
        }

        for(int i:queue.getQueue()){
            System.out.print(i);
        }System.out.println();
    }

    public static void main(String[] args) {
        for(int i=1;i<=8;i++){
            nhiPhan(i);
        }
    }
}
