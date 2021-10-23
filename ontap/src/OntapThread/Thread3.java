package OntapThread;

public class Thread3 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=2;i++){
            System.out.print("Thread 3: "+i+"\t- ");
        }
        System.out.println();
    }
}
