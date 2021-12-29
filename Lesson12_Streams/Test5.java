package Lesson12_Streams;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3,8, 1 , 5 , 9 , 12 , 4, 21, 81, 7, 18};
//
//       array =  Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));

//        int result = Arrays.stream(array).filter(e -> e%2 == 1)
//                .map(e->{if(e%3==0){e=e/3;} return e;})
//                .reduce((a,e)-> a+e).getAsInt();

       int[] result2 = Arrays.stream(array).map(e->{if(e%2==0)
       {e=2;}return e;
       }).toArray();




        System.out.println(Arrays.toString(result2));
    }
}
