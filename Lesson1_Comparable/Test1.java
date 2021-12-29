package Java_Advanced.Lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//COMPARABLE

public class Test1 {
    
    public static void main(String[] args) {
        
        List <String> list = new ArrayList<>();
        list.add("Vlad");
        list.add("Zaur");
        list.add("Maxim");

        System.out.println("Before sorting: ");
        System.out.println(list);
   
        Collections.sort(list);
        System.out.println();
        System.out.println("After sorting:");
        System.out.println(list);
    }

}
