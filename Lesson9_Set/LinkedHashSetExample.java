package Lesson9_Set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs1.add(5);
        lhs1.add(3);
        lhs1.add(1);
        lhs1.add(8 );
        lhs1.add(10);

        System.out.println(lhs1);

        lhs1.remove(8);

        System.out.println(lhs1);
        System.out.println(lhs1.contains(10));


    }
}
