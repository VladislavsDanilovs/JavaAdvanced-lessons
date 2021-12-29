package Java_Advanced.Lesson7_Collections_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(-3);
        // list1.add(8);
        // list1.add(12);
        // list1.add(-8);
        // list1.add(0);
        // list1.add(5);
        // list1.add(10);
        // list1.add(1);
        // list1.add(150);
        // list1.add(-30);
        // list1.add(19);

        // Collections.sort(list1);
        // int index1 = Collections.binarySearch(list1, 11);
        
        // System.out.println(index1);

        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(7, "Vlad", 12367);
        Employee emp3 = new Employee(123, "Tregulov", 345);
        Employee emp4 = new Employee(10, "Pavlik", 12345);
        Employee emp5 = new Employee(182, "Maksim", 12345);
        Employee emp6 = new Employee(10, "Petr", 45);
        Employee emp7 = new Employee(250, "Oleg", 12345);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);

        Collections.sort(employeeList);
        System.out.println(employeeList);

        int index2 = Collections.binarySearch(employeeList,new Employee(10, "Petr", 45));
        System.out.println(index2);

        int[] array1 = {-3, 8, 12, -8, 0, 5 , 10 , 1 , 150 , -30, 19};
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        int index3 = Arrays.binarySearch(array1, 150);
        System.out.println(index3);

    }
    
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee{" +
        "id=" + id+", name='"+name+'\'' + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        
        if(this.id == anotherEmp.id){
            return this.name.compareTo(anotherEmp.name);
        } else{
            return this.id-anotherEmp.id;

        }

    }
}
