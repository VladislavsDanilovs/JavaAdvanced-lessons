package Lesson10_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addLast(4);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerLast(4);
        deque.offerFirst(1);
        System.out.println(deque);

        System.out.println(deque.getFirst());

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollFirst());

        System.out.println(deque);



    }
}
