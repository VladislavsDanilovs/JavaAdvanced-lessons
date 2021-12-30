package Lesson13_Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example19_Lock2_ATM {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Lucian", lock);
        new Employee("David", lock);
        new Employee("Meison", lock);
        Thread.sleep(5000);
        new Employee("Reison", lock);
        new Employee("Jack", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " is waiting...");
//            lock.lock();
                System.out.println(name + " is using ATM");
                Thread.sleep(2000);
                System.out.println(name + " finished using ATM");

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " doesnt want to wait in queue ");
        }
    }
}