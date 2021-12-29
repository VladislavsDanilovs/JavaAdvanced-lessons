package Lesson13_Multithreading;

public class Example17_Deadlock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: trying to capture lock1 object monitor ");
        synchronized (Example17_Deadlock.lock1) {
            System.out.println("Thread10: monitor of lock1 object is captured");
            System.out.println("Thread10: trying to capture lock2 object monitor ");

            synchronized (Example17_Deadlock.lock2) {
                System.out.println("Thread10: monitors of objects lock1 and lock2 is captured");

            }
        }

    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: trying to capture lock2 object monitor ");
        synchronized (Example17_Deadlock.lock2) {
            System.out.println("Thread20: monitor of lock2 object is captured");
            System.out.println("Thread20: trying to capture lock1 object monitor ");

            synchronized (Example17_Deadlock.lock1) {
                System.out.println("Thread20: monitors of objects lock1 and lock2 is captured");

            }
        }

    }
}