package Java_Advanced.Lesson3_Generics.Lesson1_Intro.Lesson1_Intro;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();

        list.add("Ok");
        // list.add(5);
        // list.add(new StringBuilder("Chkar"));
        // list.add(new Car());

        list.add("hello");
        list.add("ok");

        for(Object o : list){
            System.out.println(o + " length " + ((String)o).length());
        }
    }

}

class Car{}