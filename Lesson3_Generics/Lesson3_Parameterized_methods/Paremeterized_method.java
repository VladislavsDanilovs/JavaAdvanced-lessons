package Java_Advanced.Lesson3_Generics.Lesson3_Parameterized_methods;

import java.util.ArrayList;

public class Paremeterized_method {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(25);
        list1.add(34);
        list1.add(7);
        int a = GenMethod.getSecondtElement(list1);
        System.out.println(a);

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Bcd");
        list2.add("Bcd");
        String s =  GenMethod.getSecondtElement(list2);
        System.out.println(s);


    }

    class GenMethod{
        public static <T> T getSecondtElement(ArrayList<T> al){
            return al.get(1);
        }
    }
}


