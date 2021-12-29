package Java_Advanced.Lesson5_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add(0,"Ivan");
        list1.add("Vlad");

        Iterator<String> i1 = list1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }

    }
}
