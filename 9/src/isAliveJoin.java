class MyThread extends Thread {
    public void run() {
        System.out.println("Thread started");
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread finished");
    }
}

public class isAliveJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        System.out.println("Thread state before start: " + thread.isAlive());

        thread.start();
        System.out.println("Thread state after start: " + thread.isAlive());

        thread.join(); // Wait for thread to finish
        System.out.println("Thread state after join: " + thread.isAlive());
        System.out.println("Main thread finished");
    }
}
