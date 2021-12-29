package Lesson10_Queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {

        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Pavel", 2);
        Student st3 = new Student("Oleg", 1);

        PriorityQueue<Student> prioQ = new PriorityQueue<>();
        prioQ.add(st1);
        prioQ.add(st2);
        prioQ.add(st3);

        System.out.println(prioQ.poll());
        System.out.println(prioQ.poll());
        System.out.println(prioQ.poll());
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
