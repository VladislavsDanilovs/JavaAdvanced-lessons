package Lesson12_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {

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

//        Student min = students.stream().min( (x,y) -> x.getAge()- y.getAge()).get();
////
////        Student max = students.stream().max( (x,y) -> x.getAge()- y.getAge()).get();
////
////        System.out.println(min);
////        System.out.println(max);

//        students.stream().filter(e->e.getAge()>20).forEach(System.out::println);
//        System.out.println("--------------------------------------");
//
//        students.stream().filter(e->e.getAge()>20).limit(2).forEach(System.out::println);
//        System.out.println("--------------------------------------");
//        students.stream().filter(e->e.getAge()>20).skip(2).forEach(System.out::println);

//       List<Integer>list1 = students.stream().mapToInt(e -> e.getCourse())
//
//
//               .boxed() //converts int to Integer
//               .collect(Collectors.toList());
//                System.out.println(list1);

        int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
        System.out.println(sum);
    }
}
