package Lesson8_Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linked1 = new LinkedHashMap<>(16, 0.75f, true);

        Student st2 = new Student("D", "Shaurm", 2);
        Student st3 = new Student("A", "urm", 2);
        Student st4 = new Student("C", "bras", 2);

        linked1.put(2.4, st2);
        linked1.put(3.4, st3);
        linked1.put(2.9, st4);
        System.out.println(linked1);
        System.out.println(linked1.get(3.4));
        System.out.println(linked1.get(2.4));

        System.out.println(linked1);

    }


}
