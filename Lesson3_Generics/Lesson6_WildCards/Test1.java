package Java_Advanced.Lesson3_Generics.Lesson6_WildCards;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // List<Number> list = new ArrayList<Integer>();
        // List<Object> list = new ArrayList<Integer>();
    
        List<?> list = new ArrayList<>();

        List<? extends Number> list30 = new ArrayList<Integer>();


        List <Double> list1 = new ArrayList<>();
        list1.add(3.14);

        List <String> list2 = new ArrayList<>();
        list2.add("Okey");

        ArrayList<Double> list777 = new ArrayList<>();
        list777.add(3.145124);
        list777.add(5.14);
        summ(list777);


        showListInfo(list2);
    }
    static void showListInfo(List<?> list){
        System.out.println("My list containts the following elements: " + list);
    }

    public static double summ(ArrayList<? extends Number> aL){
        double summ = 0;
        for(Number n : aL){
            summ +=n.doubleValue();
        }
        System.out.println(summ);
        return summ;
    }
}
