package prep.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> System.out.println("Task 1" + "\t\t" + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("Task 1" + "\t\t" + Thread.currentThread().getName()));
        executorService.shutdown();
    }
}
