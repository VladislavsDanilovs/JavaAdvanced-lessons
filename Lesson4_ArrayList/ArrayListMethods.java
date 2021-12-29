package Java_Advanced.Lesson4_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add(0,"Ivan");
        list1.add("Vlad");

        

        list1.set(0, "Pavlik");
        String p = list1.get(0);
        System.out.println(p);
        System.out.println(list1);
    }   
}
