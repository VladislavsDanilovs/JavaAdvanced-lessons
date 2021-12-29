package Lesson12_Streams;

import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8);
//        stream1.filter(e-> {
//            System.out.println("!!!");
//            return e % 2 ==0;
//        });
//        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
//
//        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
//
//        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
//

//


        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,1,2,3);
//        stream5.distinct().forEach(System.out::print);

        System.out.println();
        Stream<String> stream6 = Stream.of("1","2","3","4","5", "6");
//        stream6.distinct().forEach(System.out::print);

//        System.out.println(stream5.distinct().count());

        System.out.println(stream5.distinct().peek(System.out::println).count());

    }
}
