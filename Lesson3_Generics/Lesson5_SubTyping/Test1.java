package Java_Advanced.Lesson3_Generics.Lesson5_SubTyping;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        X x = new Y();

        List<X> list1 = new ArrayList<X>();

        List<Number> list2 = new ArrayList<>();
    }
}

class X{

}

class Y extends X{

}
