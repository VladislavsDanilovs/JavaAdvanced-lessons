package Lesson13_Multithreading;

public class Example4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        new Thread(()-> System.out.println("hello")).start();
    }
}
