package Lesson16_Another_Important_Topics.Reflection;

import java.lang.reflect.Field;

public class Examoke3_Reflection3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Vlad", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true); //if field is private, this method will give access to private method
        double salaryValue = (double) field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 1500); //changing private field value.
        //So Reflection breaks encapsulation principles by giving access to private fields and methods
        System.out.println(employee);
    }
}
