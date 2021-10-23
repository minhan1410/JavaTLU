package OntapThread;

public class Thread3_4 extends Thread{
    Thread thread1,thread2;

    public Thread3_4() {
    }

    public Thread3_4(Thread thread1, Thread thread2) {
        this.thread1 = thread1;
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        try {
            thread1.start();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.start();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
