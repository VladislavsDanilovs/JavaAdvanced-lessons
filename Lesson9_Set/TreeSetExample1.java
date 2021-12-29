package Lesson9_Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        Set<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(5);
        treeSet1.add(8);
        treeSet1.add(2);
        treeSet1.add(1);
        treeSet1.add(10);
        System.out.println(treeSet1);
        treeSet1.remove(2);



        System.out.println(treeSet1);
        System.out.println(treeSet1.contains(1));
    }
}
