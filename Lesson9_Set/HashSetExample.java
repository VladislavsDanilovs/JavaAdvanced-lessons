package Lesson9_Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<>();
        set1.add("Zaur");
        set1.add("Oleg");
        set1.add("Marina");
        set1.add("Pavlik");
//        set1.add(null);
        set1.remove("Zaur");
//        System.out.println(set1);
        for(String s : set1){
            System.out.println(s);
        }

        System.out.println(set1.contains("Pavlik"));



    }
}
