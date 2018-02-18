import java.util.Random;

public class MyRunnable implements Runnable {
    String threadName;
    Random myRan = new Random();
    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    public void run() {

        System.out.println("Inside " + threadName);
        while (true) {
            System.out.println("Hello from "+threadName);
            try {
                Thread.sleep(myRan.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
