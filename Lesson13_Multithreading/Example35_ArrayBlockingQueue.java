package Lesson13_Multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class Example35_ArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

        //Producer
        new Thread(() -> {
        int i =0;
        while (true) {
            try {
                arrayBlockingQueue.put(++i);
                System.out.println("Producer added: "+i+ " " + arrayBlockingQueue);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        }).start();

        //Consumer

        new Thread(() -> {
            while (true) {
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer took: "+j+ " " + arrayBlockingQueue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        }).start();

    }
}
