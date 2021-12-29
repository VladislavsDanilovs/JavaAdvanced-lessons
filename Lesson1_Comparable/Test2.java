package Java_Advanced.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//COMPARABLE
public class Test2 {
    public static void main(String[] args) {
        
        List <Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 1000);
        Employee emp2 = new Employee(15, "Pavlik", "Sidorov", 425);
        Employee emp3 = new Employee(123, "Artur", "Bartkauskas", 455);

        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        
        // Arrays.sort(new Employee [] {emp1, emp2, emp3});

        System.err.println("Before sorting \n " + list1);
    
        Collections.sort(list1);

        System.err.println("After sorting \n " + list1);


    }
}


class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    Employee(int id, String name, String surname, int salary){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
        "id= " + id + ", name=  " + name + '\''+ ", surname= " + surname +'\''+
        "salary: " + salary + "}";
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        // if(this.id == anotherEmp.id){
        //     return 0;
        // } else if(this.id > anotherEmp.id){
        //     return 1;
        // } else {
        //     return -1;
        // }
       
        if (this.name == anotherEmp.name){
            return   this.surname.compareTo(anotherEmp.surname);
        } else{
           return this.name.compareTo(anotherEmp.name);

        }
    }
}