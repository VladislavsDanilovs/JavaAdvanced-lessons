package Lesson8_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashcode {
    public static void main(String[] args) {
        Map<Double, String> map = new HashMap<>();

        Student st1 = new Student("Zaur", "Tregulof", 3);

        TreeMap<Double, Student> treeMap1 = new TreeMap<>();
        Student st2 = new Student("D", "Shaurm", 2 );
        Student st3 = new Student("A", "urm", 2 );
        Student st4 = new Student("C", "bras", 2 );

//
        treeMap1.put(0.5, st4);
        treeMap1.put(1.5, st3);
        treeMap1.put(2.5, st2);
        treeMap1.put(4.5,st1);
//
        System.out.println(treeMap1);
//
//        System.out.println(treeMap1.headMap(4.5));
    }
}
