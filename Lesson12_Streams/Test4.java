package Lesson12_Streams;

import Lesson0_PracticeGUI.Login_System.Attempt1.Passwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 8, 2, 4));
        list.add(3);
        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);

        //5, 8, 2, 4, 3
        //accumulator = 5   40  80  320 960
        //element =     8   2   4   3
        //Output will be 960. First value 5 is accumulator!
        //Others values is elements!

        int result2 = list.stream().reduce(1,(accumulator, element) ->
                accumulator * element);
        System.out.println(result);

        //5, 8, 2, 4, 3
        //accumulator = 1   5   40  80  320 960
        //element =     5   8   2   4   3

        List<String> list3 = new ArrayList<>(Arrays.asList("Hello","Bye","Good", "Bad"));
        String result3 = list3.stream().reduce((a, e)->
                a+e).get();
        System.out.println(result3);
//        Optional<Integer> o1 = list.stream().reduce((accumulator, element) ->
//                accumulator * element);
//        if (o1.isPresent()) {
//            System.out.println(o1);
//        } else {
//            System.out.println("Not present");
//        }

    }
}
