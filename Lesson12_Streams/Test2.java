package Lesson12_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
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


//        students.stream().map(e ->
//                        {
//                            e.setName(e.getName().substring(0,1).toUpperCase()+e.getName().substring(1));
//
//                            return e;
//                        }
//
//
//                ).filter(e ->
//                        {
//                            return e.getSex() == 'f';
//                        }
//                )
//                .sorted((x, y) ->
//                        x.getAge() - y.getAge()
//                )
//                .forEach(e ->
//                        System.out.println(e)
//                );



        Student firs1 = students.stream().map(e ->
                        {
                            e.setName(e.getName().substring(0,1).toUpperCase()+e.getName().substring(1));

                            return e;
                        }


                ).filter(e ->
                        {
                            return e.getSex() == 'f';
                        }
                )
                .sorted((x, y) ->
                        x.getAge() - y.getAge()
                )
                .findFirst().get();

        System.out.println(firs1);

//                .collect(Collectors.toList());


//        System.out.println(students);


//        List<Student> list2 = students.stream().filter(e ->
//        {return e.getAverageGrade() > 8;}).collect(Collectors.toList());

//
//        System.out.println(list2);

        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        myStream.filter(e ->
        {
            return e.getAverageGrade() > 8;
        }).collect(Collectors.toList());
    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double averageGrade;

    public Student(String name, char sex, int age, int course, double averageGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}


//        students = students.stream().sorted((x,y) ->
//                x.getName().compareTo(y.getName())
//                ).collect(Collectors.toList());