package Lesson13_Multithreading;

public class Example6 implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example6());
        thread.start();
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName());
    }
}
