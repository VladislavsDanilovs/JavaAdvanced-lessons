package Lesson13_Multithreading;

public class Example11 {
    public static void main(String[] args) {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
     static int count = 0;
}

class MyRunnableImpl1 implements Runnable{
    public void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }


    @Override
    public void run() {
        for(int i =0; i<3; i++){
            increment();
            //We can see Data race issue in output, since variable count not synchronized,
            // and every thread is overriding it in main memory
            //so we should add keyword synchronized in increment() method declaration
        }
    }
}