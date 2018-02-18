
public class App {

    public static void main(String[] args)
    {
        Runnable r = new MyRunnable("Thread1");
        System.out.println("Starting thread 1");
        new Thread(r).start();
        try {
            System.out.println("Waiting before starting thread 2");
            Thread.sleep(2000);
            System.out.println("After sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Runnable r2 = new MyRunnable("Thread2");
        System.out.println("Starting thread 2");
        new Thread(r2).start();
        System.out.println("End of main");
    }

}


