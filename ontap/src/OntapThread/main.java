package OntapThread;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Star");

//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 2; i++) {
//                    System.out.print("Thread 1: " + i+"\t- ");
//                }
//                System.out.println();
//            }
//        });
//        thread1.start();
//        thread1.join();
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 1; i <= 2; i++) {
//                System.out.print("Thread 2: " + i+"\t- ");
//            }
//            System.out.println();
//        });
//        thread2.start();
//        thread2.join();
//
//        Thread thread3 = new Thread(new Thread3());
//        thread3.start();
//        thread3.join();
//
//        Thread thread4 = new Therad4();
//        thread4.start();
//        thread4.join();


        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 2; i++) {
                    System.out.print("Thread 5: " + i+"\t- ");
                }
                System.out.println();
            }
        });

        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 3; i <= 4; i++) {
                    System.out.print("Thread 6: " + i+"\t- ");
                }
                System.out.println();
            }
        });

        Thread thread7= new Thread3_4(thread5,thread6);
        thread7.start();thread7.join();

        System.out.println("End");

    }
}
