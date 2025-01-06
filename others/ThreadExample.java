class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + " is running");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Starting both threads
        t1.start();
        t2.start();
    }
}
