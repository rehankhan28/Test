package prep.thread;

public class DemoInterfaceThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        t1.start();
        t2.start();
    }
}

class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(i + "\t\t" + thread.getName() + "\t\t" + thread.getPriority());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}