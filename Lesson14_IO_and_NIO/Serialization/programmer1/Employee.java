package Lesson14_IO_and_NIO.Serialization.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname; //Got a new task, to add surname, and delete age
    String department;
//    int age;
    transient double salary; //We  dont want send this info to programmer2, so we use keyword transient.
    Car car;

    public Employee(String name,
                    String surname,
                    String department,
//                    int age,
                    double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
//        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                "surname= " + surname +
                ", department='" + department + '\'' +
//                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
