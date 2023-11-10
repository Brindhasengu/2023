package AutomationPractice;

public class LocalThread implements Runnable {
    private int i = 0;

    public static void main(String[] args) {

        LocalThread object = new LocalThread();
        Thread thread1 = new Thread(object);
        thread1.start();

        Thread thread2 = new Thread(object);
        thread2.start();


    }

    public void run() {
        i = i + 1;
        System.out.println("This code is running in a thread " + i );
    }
}

