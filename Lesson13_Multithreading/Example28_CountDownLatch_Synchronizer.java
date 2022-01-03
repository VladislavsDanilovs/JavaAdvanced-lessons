package Lesson13_Multithreading;

import java.util.concurrent.CountDownLatch;

public class Example28_CountDownLatch_Synchronizer {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnWork() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = "+ countDownLatch.getCount());
    }

    private static void allIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Market is ready for opening");
        countDownLatch.countDown();
        System.out.println("countDownLatch = "+ countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch = "+ countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Cusmoter("Vladislav", countDownLatch);
        new Cusmoter("Vladimir", countDownLatch);
        new Cusmoter("Oleg", countDownLatch);
        new Cusmoter("Elena", countDownLatch);
        new Cusmoter("Viktor", countDownLatch);

        marketStaffIsOnWork();
        allIsReady();
        openMarket();
    }
}

class Cusmoter extends Thread{
    String name;
    private CountDownLatch countDownLatch;
    public Cusmoter(String name, CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    @Override
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name+ " started shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}