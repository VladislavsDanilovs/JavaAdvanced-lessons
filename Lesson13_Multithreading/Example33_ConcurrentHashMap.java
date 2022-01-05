package Lesson13_Multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Example33_ConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map1 = new ConcurrentHashMap<>();
        map1.put(1, "Vlad");
        map1.put(2, "Viktor");
        map1.put(3, "Vitaly");
        map1.put(4, "Vladimir");
        map1.put(5, "Vasily");
//        map1.put(8, null); doesnt work with null
        System.out.println(map1);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map1.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":"+ map1.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map1.put(6, "Vadim");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map1);
    }
}
