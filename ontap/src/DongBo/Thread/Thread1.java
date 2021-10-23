package DongBo.Thread;

import java.util.ArrayList;

public class Thread1 extends Thread{
    ArrayList<Integer> list1;

    public Thread1() {
        list1=new ArrayList<Integer>();
    }

    public Thread1(ArrayList<Integer> list1) {
        this.list1 = list1;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);

            for(int i=0;i<10;i++){
                System.out.println("DongBo.Thread(1) - "+(int)(Math.random()*100));
                list1.add((int)(Math.random()*100));
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
    }
}
