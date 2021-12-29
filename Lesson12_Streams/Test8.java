package Lesson12_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("petr", 'm', 35, 4, 7);
        Student st5 = new Student("mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Map<Integer, List<Student>> list1 = students.stream().map(e -> {
//                    e.setName(e.getName().toUpperCase());
//                    return e;
//                })
//                .collect(Collectors.groupingBy(e -> e.getCourse()));
//
//        for(Integer k: list1.keySet()){
//            System.out.println(k+" = " + list1.get(k));
//        }

        Map<Boolean, List<Student>> list1 =
                    students.stream()

                    .collect(Collectors.partitioningBy(e -> e.getAverageGrade()>7));

        for (Boolean k : list1.keySet()) {
            System.out.println(k + " = " + list1.get(k));
        }


    }
}
