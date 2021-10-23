package OntapThread;

public class Therad4 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=2;i++){
            System.out.print("Thread 4: "+i+"\t- ");
        }
        System.out.println();
    }
}
