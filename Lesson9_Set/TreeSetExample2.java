package Lesson9_Set;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
    TreeSet<Student> treeSet1 = new TreeSet<>();
        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Pavel", 2);
        Student st3 = new Student("Oleg", 1);
        treeSet1.add(st1);
        treeSet1.add(st2);
        treeSet1.add(st3);

        Student st4 = new Student("Evil", 2);
        Student st5 = new Student("PatrikStar", 2);

        System.out.println(treeSet1);
        System.out.println(treeSet1.subSet(st4,st5));

        System.out.println(st4.equals(st5));
        System.out.println(st4.compareTo(st5));
        System.out.println(st4.hashCode()==st5.hashCode());
    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
