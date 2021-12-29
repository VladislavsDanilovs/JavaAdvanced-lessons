package Lesson10_Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> prQ = new PriorityQueue<>();
        prQ.add(4);
        prQ.add(8);
        prQ.add(10);
        prQ.add(7);

        System.out.println(prQ);
        System.out.println(prQ.remove());
        System.out.println(prQ.remove());
        System.out.println(prQ.remove());
        System.out.println(prQ.remove());
    }
}
