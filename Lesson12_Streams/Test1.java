package Lesson12_Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("GoodBye");
        list.add("Stream lesson");

//        for(int i=0; i<list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        // 6 9 2 4
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println(list2);

        int[] array1 = {5, 9, 3, 8, 1};

       array1 = Arrays.stream(array1).map(e ->
        {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).toArray();
//        System.out.println(Arrays.toString(array1));

        Set<String> set = new TreeSet<>();

        set.add("Cat");
        set.add("Dog");
        set.add("Set collections with streams");
        set.add("Practice with streams");

        System.out.println(set);
        Set<Integer> set2 = set.stream().map(e-> e.length()).collect(Collectors.toSet());
        System.out.println(set2);

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(list3);

        list3.add(6);
        System.out.println(list3);

    }

}

