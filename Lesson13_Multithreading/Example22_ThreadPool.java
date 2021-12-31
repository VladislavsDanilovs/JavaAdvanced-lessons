package Lesson13_Multithreading;

import java.util.concurrent.*;

public class Example22_ThreadPool {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
            ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i=0; i<10; i++){
            executorService.execute(new RunnableImplementation100());
        }
        executorService.shutdown();
//        executorService.awaitTermination(5, TimeUnit.SECONDS);
//        System.out.println("main ends");
    }
}

class RunnableImplementation100 implements Runnable {

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " begins work");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}