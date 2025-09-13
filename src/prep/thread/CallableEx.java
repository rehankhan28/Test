package prep.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableEx {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask(myCallable);
        Thread th = new Thread(futureTask);
        th.start();
    }
}

class MyCallable implements Callable {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i + "\t" + Thread.currentThread().getName());
                Thread.sleep(1200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "Hello";
    }
}