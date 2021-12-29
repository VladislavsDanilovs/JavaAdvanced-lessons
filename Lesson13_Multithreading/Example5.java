package Lesson13_Multithreading;

public class Example5 {
    public static void main(String[] args) {
    MyThread5 thread5 = new MyThread5();
    thread5.setName("My Thread");
    thread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of thread5 ="+thread5.getName() +
                " Priority of thread5 = "+thread5.getPriority());





    }


}


class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("hello");
    }
}
