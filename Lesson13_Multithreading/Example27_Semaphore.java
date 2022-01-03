package Lesson13_Multithreading;

import java.util.concurrent.Semaphore;

public class Example27_Semaphore {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Vladimir", callBox);
        new Person("Dmitrij", callBox);
        new Person("Jaison", callBox);
        new Person("David", callBox);
        new Person("Katarina", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    @Override
    public void run(){
        try {
            System.out.println(name + " is waiting");
            callBox.acquire();
            System.out.println(name + " using phone from call-box");
            sleep(2000);
            System.out.println(name +" finished call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}