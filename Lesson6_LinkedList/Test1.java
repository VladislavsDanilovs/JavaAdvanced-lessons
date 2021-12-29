package Java_Advanced.Lesson6_LinkedList;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        Student1 st1 = new Student1("Ivan", 3);
        Student1 st2 = new Student1("Nikolay", 2);
        Student1 st3 = new Student1("Elena", 1);
        Student1 st4 = new Student1("Petr", 4);
        Student1 st5 = new Student1("Marija", 3);
        LinkedList<Student1> linkedlist1 = new LinkedList<>();
        linkedlist1.add(st1);
        linkedlist1.add(st2);
        linkedlist1.add(st3);
        linkedlist1.add(st4);
        linkedlist1.add(st5);
        // System.out.println("Linkedlist: "+linkedlist1);
    
        System.out.println(linkedlist1.get(2));


        Student1 st6 = new Student1("Zaur", 7);
        Student1 st7 = new Student1("Tregulov", 7);

        linkedlist1.add(st6);

        linkedlist1.remove(2);

        System.out.println(linkedlist1);

    }

}

class Student1 {
    String name;
    int course;

    Student1(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name= '" + name + '\'' + ", course=" + course + '}';
    }

}
