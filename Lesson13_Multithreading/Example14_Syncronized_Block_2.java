package Lesson13_Multithreading;

public class Example14_Syncronized_Block_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

    static int counter = 0;
    public static void increment() {
        synchronized (Example14_Syncronized_Block_2.class){
            counter++;
        }

    }
}

class R2 implements  Runnable {

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            Example12.increment();
        }
    }
}
