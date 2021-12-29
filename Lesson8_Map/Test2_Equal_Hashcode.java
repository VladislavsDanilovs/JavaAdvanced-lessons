package Java_Advanced.Lesson8_Map;

public class Test2_Equal_Hashcode {

}

class Student{

    String name;
    String surname;
    int course;

    Student(String name, String surname, int course){

        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return name + surname + course;
    }



}
