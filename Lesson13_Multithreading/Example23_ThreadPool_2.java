package Lesson13_Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example23_ThreadPool_2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

//        for(int i=0; i<10; i++){
//            scheduledExecutorService.execute(new RunnableImplementation200());
//        }
//        scheduledExecutorService.schedule(new RunnableImplementation200(),
//                3, TimeUnit.SECONDS);


//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImplementation200(),
//                3, 1, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImplementation200(),
                3, 10, TimeUnit.SECONDS);

        Thread.sleep(20_000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}

class RunnableImplementation200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}