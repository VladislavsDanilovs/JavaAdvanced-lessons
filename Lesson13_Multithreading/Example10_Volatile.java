package Lesson13_Multithreading;
//Volatile
public class Example10_Volatile extends Thread {
    volatile boolean b = true;


    public void run(){
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished, counter = "+counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Example10_Volatile thread = new Example10_Volatile();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds, wake up");
        thread.b = false;
        thread.join();
        System.out.println("End of program");


    }
}
