package Lesson13_Multithreading;

public class Example8 extends Thread {
    public void run(){
        for(int i=1; i<10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +" "+i );
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new myRunnable1());
        Example8 thread2 = new Example8();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("end");
    }
}

class myRunnable1 implements Runnable {
    @Override
    public void run(){
        for(int i=1; i<10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +" "+i );
        }
    }
}
