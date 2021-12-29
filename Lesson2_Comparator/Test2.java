package Java_Advanced.Lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//COMPARATOR
public class Test2 {
    public static void main(String[] args) {
        
        List <Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 1000);
        Employee emp2 = new Employee(15, "Maxim", "Maksimov", 425);
        Employee emp3 = new Employee(123, "Pavlik", "Pavlov", 455);

        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        

        System.err.println("Before sorting \n " + list1);
    
        Collections.sort(list1, new NameComparator());;
        System.err.println("After sorting \n " + list1);


    }
}


class Employee {
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

}

// class IdComparator implements Comparator<Employee> {

//     @Override
//     public int compare(Employee emp1, Employee emp2) {
      
//               if(emp1.id == emp2.id){
//             return 0;
//         } else if(emp1.id > emp2.id){
//             return 1;
//         } else {
//             return -1;
//         }


//     }
    
// }

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
      
       return emp1.name.compareTo(emp2.name);


    }
    
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
      
       return emp1.salary-emp2.salary;


    }
    
}