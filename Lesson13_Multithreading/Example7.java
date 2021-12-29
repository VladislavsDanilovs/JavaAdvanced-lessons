package Lesson13_Multithreading;

public class Example7 {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("gg");
    }
}
