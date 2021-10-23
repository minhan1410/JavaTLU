package DongBo.Thread;

import java.util.ArrayList;
import java.util.Random;

public class Thread2 extends Thread{
    ArrayList<Character> list2=new ArrayList<Character>();
    Thread thread;
    Random random=new Random();

    public Thread2(Thread v){
        this.thread=v;
    }

    public Thread2(ArrayList<Character> list2) {
        this.list2 = list2;
    }

    @Override
    public void run() {
        try {
            thread.join();

            Thread.sleep(2000);
            System.out.println();

            for(int i=0;i<10;i++){
                int a=random.nextInt(26)+65;
                System.out.println("DongBo.Thread(2) - "+(int)(a)+ " - "+(char)(a));
                list2.add((char)(a));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
    }
}
