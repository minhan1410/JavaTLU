package DongBo.VD2;

import DongBo.VD1.ShareData;

public class Thread2 extends Thread{
    ShareData shareData;

    public Thread2(ShareData shareData){
        this.shareData=shareData;
    }

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            synchronized (shareData){
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int x=shareData.getRandom()*shareData.getRandom();
                System.out.println("T2= "+x);

                shareData.notifyAll();
            }
        }
        super.run();
    }
}
