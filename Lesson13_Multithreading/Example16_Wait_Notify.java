package Lesson13_Multithreading;

public class Example16_Wait_Notify {
    public static void main(String[] args) {
        Market market = new Market();
        Bakery bakery = new Bakery(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(bakery);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount = 0;
    private final Object lock = new Object();

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount--;
            System.out.println("Customer bought 1 bread");
            System.out.println("Bread quantity in store is = " + breadCount);
            lock.notify();
        }
    }

    public void putBread() {
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount++;
            System.out.println("Bakery has baked 1 bread");
            System.out.println("Bread quantity in store is = " + breadCount);
            lock.notify();
        }
    }
}

class Bakery implements Runnable {
    Market market;

    Bakery(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
