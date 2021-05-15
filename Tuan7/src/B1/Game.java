package B1;

import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int random=10;

        do{
            System.out.print("Nhap vao 1 so (1->100): ");random=scanner.nextInt();
        }while(random<1 || random>100);

        Thread_DoanSo t1=new Thread_DoanSo(random,"Nguoi 1");
        Thread_DoanSo t2=new Thread_DoanSo(random,"Nguoi 2");

        t1.start();t2.start();
    }
}
