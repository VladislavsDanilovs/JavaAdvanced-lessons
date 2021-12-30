package Lesson13_Multithreading;

public class Example21_Thread_Interruption {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(2000);
        interruptedThread.interrupt();

        interruptedThread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Thread got interruption request");
                System.out.println("Objects states is ok, finishing work");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Trying to interrupt thread at sleeping");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
