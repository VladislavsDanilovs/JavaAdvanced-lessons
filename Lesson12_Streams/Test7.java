package Lesson12_Streams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("elena", 'f', 19, 1, 8.9);


        Faculty f1 = new Faculty("Electrical");
        Faculty f2 = new Faculty("Economics");
        Faculty f3 = new Faculty("IT");

        f1.addStudentToFaculty(st1);
        f2.addStudentToFaculty(st2);
        f3.addStudentToFaculty(st3);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
        facultyList.add(f3);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsFaculty().stream())
                .forEach(e-> System.out.println(e.getName()));
        }
}

class Faculty{
    String name;
    List<Student> studentsFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsFaculty() {
        return studentsFaculty;
    }

    public void addStudentToFaculty(Student st){
        studentsFaculty.add(st);
    }
}