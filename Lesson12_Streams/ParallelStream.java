package Lesson12_Streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    // 1 2 3 4 ... 1.000.000
    // 1    250.000
    //250.001   500.000
    //500.001   750.000
    //750.000   1.000.000

    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();
        list1.add(10.0);
        list1.add(5.0);
        list1.add(1.0);
        list1.add(0.25);

//        double sumResult = list1.parallelStream()
//                .reduce((accumulator, element) -> accumulator + element).get();
//        System.out.println("someResult = " + sumResult);

        double divResult = list1.parallelStream()
                .reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("divResult = " + divResult);

    }
}
